package com.account;

import com.customer.Customer;

public class AccountMain {
	public static void main(String[] args) {
		Account acc=new Account();
		acc.setAccNo(123L);
		acc.setBalance(2000.0);
	System.out.println(acc.getAccNo()+" "+acc.getBalance());
	Customer cust =new Customer();
	cust.setCustId(2);
	cust.setCustName("moi");
	cust.setEmail("moi@gmail.com");
	acc.setCust(cust);
	System.out.println(acc.getCust().getCustId()+" "+acc.getCust().getCustName()+" "+acc.getCust().getEmail());
	}
}
