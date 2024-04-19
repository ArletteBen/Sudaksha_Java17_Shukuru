package com.sudaska.account.exception;

public class AccountNotFoundException extends RuntimeException {

	public AccountNotFoundException() {
		super("Account not found or invalid Dates");
	}

}
