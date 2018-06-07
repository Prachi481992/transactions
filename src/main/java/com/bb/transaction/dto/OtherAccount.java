package com.bb.transaction.dto;

public class OtherAccount {
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Holder getHolder() {
		return holder;
	}

	public void setHolder(Holder holder) {
		this.holder = holder;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getIBAN() {
		return IBAN;
	}

	public void setIBAN(String iBAN) {
		IBAN = iBAN;
	}

	public String getSwift_bic() {
		return swift_bic;
	}

	public void setSwift_bic(String swift_bic) {
		this.swift_bic = swift_bic;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public Metadata getMetadata() {
		return metadata;
	}

	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}

	private String id;
	
	private Holder holder;
	
	private String number;
	
	private String kind;
	
	private String IBAN;
	
	private String swift_bic;
	
	private Bank bank;
	
	private Metadata metadata;
}
