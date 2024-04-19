package com.customer;


public class CustomerMain {
	public static void main(String[] args) {
		Customer cust=new Customer();
		cust.setCustId(1);
		cust.setCustName("Arlette");
		cust.setEmail("arl@gmail.com");
	System.out.println(cust.getCustId()+" "+cust.getCustName()+" "+cust.getEmail());
	}
}
