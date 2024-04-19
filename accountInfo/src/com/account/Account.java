package com.account;

import com.customer.Customer;

public class Account {
private Long accNo;
private double balance;
private Customer cust;

public Customer getCust() {
	return cust;
}
public void setCust(Customer cust) {
	this.cust = cust;
}
public Long getAccNo() {
	return accNo;
}
public void setAccNo(Long accNo) {
	this.accNo = accNo;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
@Override
public String toString() {
	return "Account [accNo=" + accNo + ", balance=" + balance + "]";
}

}
