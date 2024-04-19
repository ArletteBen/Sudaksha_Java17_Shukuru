package com.sudaska.account.beans;

import java.io.Serializable;

public class Account  implements Serializable{
private int accountNumber;
private String customerName;
private double balance;

/*public Account(int accountNumber, String customerName, double balance) {
	this.accountNumber = accountNumber;
	this.customerName = customerName;
	this.balance = balance;
}*/
public int getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
@Override
public String toString() {
	return "Account [accountNumber=" + accountNumber + ", customerName=" + customerName + ", balance=" + balance + "]";
}

}
