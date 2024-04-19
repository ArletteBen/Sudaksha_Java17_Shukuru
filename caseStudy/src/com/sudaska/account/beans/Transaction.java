package com.sudaska.account.beans;
import java.io.Serializable;
import java.time.LocalDate;
public record Transaction(LocalDate date, int acno, String transType,String particulars, Double amount) implements Serializable
//,Comparable<Transaction> 
{

	
	public LocalDate date() {
		return date;
	}

	public int acno() {
		return acno;
	}

	public String transType() {
		return transType;
	}

	public String particulars() {
		return particulars;
	}

	public Double amount() {
		return amount;
	}

	/*@Override
	public int compareTo(Transaction o) {
    int x=this.date.compareTo(o.date);
	return x;
	}*/

}
