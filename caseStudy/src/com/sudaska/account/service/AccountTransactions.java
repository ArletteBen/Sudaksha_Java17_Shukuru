package com.sudaska.account.service;

import java.io.File;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.sudaska.account.beans.Account;
import com.sudaska.account.beans.Transaction;
import com.sudaska.account.dao.AccountDao;
import com.sudaska.account.dao.TransactionDao;
import com.sudaska.account.exception.AccountNotFoundException;
import com.sudaska.account.exception.InsufficientBalanceException;
public class AccountTransactions {
AccountDao accDao=new AccountDao();
TransactionDao transDao=new TransactionDao();
public void createAccount(Account account) {
	List<Account> accountList=accDao.read();
	//List<Account> accList=accDao.read();
	int maxAccNo=1001;
	File file=new File("C:\\Users\\shu2207083104\\Desktop\\java17IO\\accountDet");
	if(file.exists()) {
		List<Integer> accNoList=accountList.stream().map((e)->e.getAccountNumber()).collect(Collectors.toList());
		
		if(!accNoList.isEmpty()) {
			 maxAccNo=Collections.max(accNoList)+1;
		}
	}
		account.setAccountNumber(maxAccNo);
		accountList.add(account);
		accDao.write(accountList);
		List<Transaction>transList=transDao.read();
		transList.add(new Transaction(LocalDate.now(),maxAccNo,"create","account created",account.getBalance()));
		transDao.write(transList);
		System.out.println("account created. your account number is "+maxAccNo);
}
public void deposit(int accountNumber, double amount) {
	List<Account> accountList=accDao.read();
	try {
			Account acc=accountList.stream().filter((e)->e.getAccountNumber()==accountNumber)
					.map((e)->e).findAny().orElseThrow(()->new AccountNotFoundException());
			acc.setBalance(acc.getBalance()+amount);
			List<Transaction>transList=transDao.read();
			transList.add(new Transaction(LocalDate.now(),acc.getAccountNumber(),"deposit","deposited "+amount,acc.getBalance()));
			transDao.write(transList);
			accDao.write(accountList);
			System.out.println("balance deposited. your new balance is "+acc.getBalance());	
     }catch(AccountNotFoundException e) {
	System.out.println(e.getMessage());
     }
}
public void withdraw(int accountNumber, double amount) {
	List<Account> accountList=accDao.read();
	try {
		Account acc=accountList.stream().filter((e)->e.getAccountNumber()==accountNumber)
				.map((e)->e).findAny().orElseThrow(()->new AccountNotFoundException());
		if(acc.getBalance()>=amount) {
			acc.setBalance(acc.getBalance()-amount);
			List<Transaction>transList=transDao.read();
			transList.add(new Transaction(LocalDate.now(),acc.getAccountNumber(),"withdraw","withdrew "+amount+" from the account",acc.getBalance()));
			transDao.write(transList);
			accDao.write(accountList);
			System.out.println("balance withdrawn. your new balance is "+acc.getBalance());
			}else {
				throw new InsufficientBalanceException();
			}
	     }catch(AccountNotFoundException | InsufficientBalanceException e) {
		System.out.println(e.getMessage());
	     }
}
public void checkBalance(int accountNumber) {
	List<Account> accountList=accDao.read();
	try {
		Account acc=accountList.stream().filter((e)->e.getAccountNumber()==accountNumber)
				.map((e)->e).findAny().orElseThrow(()->new AccountNotFoundException());
			System.out.println("your balance is "+acc.getBalance());
	     }catch(AccountNotFoundException e) {
		System.out.println(e.getMessage());
	     }
}
public void viewTransactions(int accountNumber,String fDate, String tDate) {
	List<Transaction> transList=transDao.read();
	LocalDate fromDate=LocalDate.parse(fDate);
	LocalDate toDate=LocalDate.parse(tDate);
	try {
		/*List<Transaction> translst=transList.stream().filter((e)->e.acno()==accountNumber &&(
				(fromDate.isBefore(e.date())|| fromDate.equals(e.date()))&& (toDate.isAfter(e.date())||toDate.equals(e.date()))))
				.map((e)->e).collect(Collectors.toList());*/
		List<Transaction> transAcc=transList.stream().filter((e)->e.acno()==accountNumber)
				.map((e)->e).collect(Collectors.toList());
		if(!transAcc.isEmpty()) {
			List<Transaction> transD=transList.stream().filter((e)->e.acno()==accountNumber &&(
					(fromDate.isBefore(e.date())|| fromDate.equals(e.date()))&& (toDate.isAfter(e.date())||toDate.equals(e.date()))))
					.map((e)->e).collect(Collectors.toList());
			if(!transD.isEmpty()) {
				for(Transaction trans:transD) {
					System.out.println("Date: "+trans.date()+" |account number:"+trans.acno()+" |Particulars:"+trans.particulars()+ " |transaction type:"+trans.transType()+" |amount:"+trans.amount());
				}
			}else {
				System.out.println("Invalid Dates");
			}
		}else {
			throw new AccountNotFoundException();
		}
		/*if(!translst.isEmpty()) {
			for(Transaction trans:translst) {
				System.out.println("Date: "+trans.date()+" |account number:"+trans.acno()+" |Particulars:"+trans.particulars()+ " |transaction type:"+trans.transType()+" |amount:"+trans.amount());
			}
		}else {
			throw new AccountNotFoundException();
		}*/
	     }catch(AccountNotFoundException e) {
		System.out.println(e.getMessage());
	     }
}
}
