package com.bb.transaction.dto;

public class Transaction {

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Account getThis_account() {
		return this_account;
	}

	public void setThis_account(Account this_account) {
		this.this_account = this_account;
	}

	public Account getOther_account() {
		return other_account;
	}

	public void setOther_account(Account other_account) {
		this.other_account = other_account;
	}

	public TransactionDetails getDetails() {
		return details;
	}

	public void setDetails(TransactionDetails details) {
		this.details = details;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public TransactionMetadata getMetadata() {
		return metadata;
	}

	public void setMetadata(TransactionMetadata metadata) {
		this.metadata = metadata;
	}

	private String id;
	
	private Account this_account;
	
	private Account other_account;
	
	private TransactionDetails details;
	
	private float amount;
	
	private TransactionMetadata metadata;
}
