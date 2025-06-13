package com.q19.account;

public class Account {
	private int balance;
	private static final int MAX_BALANCE = 1000000, MIN_BALANCE = 0;
	
	public void setBalance(int balance) {
		if(balance >= MIN_BALANCE && MAX_BALANCE >= balance)
			this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}
}
