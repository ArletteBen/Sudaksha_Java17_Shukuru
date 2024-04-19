package com.sudaska.account.main;

import java.time.LocalDateTime;
import java.util.Scanner;

import com.sudaska.account.beans.Account;
import com.sudaska.account.service.AccountTransactions;

public class AccountsApplication {

	public static void main(String[] args) {
		
		AccountTransactions tran=new AccountTransactions();
		Scanner sc=new Scanner(System.in);
	int choice=0;
	int accNo;
	String customerName="";
	double balance=0;
	Account account=new Account();
	String fromDate;
	String toDate;
	while (choice!=6) {
		System.out.println("1.create account");
		System.out.println("2.deposit");
		System.out.println("3.withdraw");
		System.out.println("4.check balance");
		System.out.println("5.view Transactions");
		System.out.println("6.exit");
		System.out.println("enter your choice: ");
		choice=sc.nextInt();
		switch(choice) {
		case 1:{
			 sc=new Scanner(System.in);
			System.out.println("enter the customer name: ");
			account.setCustomerName(sc.nextLine());
			System.out.println("enter the opening balance: ");
			account.setBalance(sc.nextDouble());
			tran.createAccount(account);
			break;
		}
		case 2:{
			    sc=new Scanner(System.in);
				System.out.println("enter your account number: ");
				accNo=sc.nextInt();
				System.out.println("enter the amount to be deposited: ");
				balance=sc.nextDouble();
				tran.deposit(accNo, balance);
				break;
		}
		case 3:{
		    sc=new Scanner(System.in);
			System.out.println("enter your account number: ");
			accNo=sc.nextInt();
			System.out.println("enter the amount to be withdrawn: ");
			balance=sc.nextDouble();
			tran.withdraw(accNo, balance);
			break;
	}
		case 4:{
		    sc=new Scanner(System.in);
			System.out.println("enter your account number: ");
			accNo=sc.nextInt();
			tran.checkBalance(accNo);
			break;
	}
		case 5:{
		    sc=new Scanner(System.in);
			System.out.println("enter your account number: ");
			accNo=sc.nextInt();
			sc=new Scanner(System.in);
			System.out.println("enter from date (yyyy-mm-dd) ");
			fromDate=sc.nextLine();
			System.out.println("enter to date (yyyy-mm-dd) ");
			toDate=sc.nextLine();
			tran.viewTransactions(accNo,fromDate,toDate);
			break;
	}
		}
	}

	}

}
