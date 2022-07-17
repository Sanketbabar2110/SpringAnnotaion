package com.prowings.ComponantAnnotation.Autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("customer")
public class Customer {
	
	@Value("Saving")
	private String accType;
	
	@Value("10000")
	private int balance;
	
	@Autowired
	private CustomerDetails details;

	public Customer() {
		super();
	}

	public Customer(String accType, int balance, CustomerDetails details) {
		super();
		this.accType = accType;
		this.balance = balance;
		this.details = details;
	}

	@Override
	public String toString() {
		return "Customer [accType=" + accType + ", balance=" + balance + ", details=" + details + "]";
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public CustomerDetails getDetails() {
		return details;
	}

	public void setDetails(CustomerDetails details) {
		this.details = details;
	}
}
