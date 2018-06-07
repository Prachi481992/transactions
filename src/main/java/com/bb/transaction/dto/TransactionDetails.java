package com.bb.transaction.dto;

import java.util.Date;

public class TransactionDetails {
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getPosted() {
		return posted;
	}

	public void setPosted(Date posted) {
		this.posted = posted;
	}

	public Date getCompleted() {
		return completed;
	}

	public void setCompleted(Date completed) {
		this.completed = completed;
	}

	public Balance getNew_balance() {
		return new_balance;
	}

	public void setNew_balance(Balance new_balance) {
		this.new_balance = new_balance;
	}

	private String type;
	
	private String description;
	
	private Date posted;
	
	private Date completed;
	
	private Balance new_balance;

}
