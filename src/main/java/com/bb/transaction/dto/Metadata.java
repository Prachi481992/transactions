package com.bb.transaction.dto;

public class Metadata {
	
	public String getPublic_alias() {
		return public_alias;
	}

	public void setPublic_alias(String public_alias) {
		this.public_alias = public_alias;
	}

	public String getPrivate_alias() {
		return private_alias;
	}

	public void setPrivate_alias(String private_alias) {
		this.private_alias = private_alias;
	}

	public String getMore_info() {
		return more_info;
	}

	public void setMore_info(String more_info) {
		this.more_info = more_info;
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}

	public String getImage_URL() {
		return image_URL;
	}

	public void setImage_URL(String image_URL) {
		this.image_URL = image_URL;
	}

	public String getOpen_corporates_URL() {
		return open_corporates_URL;
	}

	public void setOpen_corporates_URL(String open_corporates_URL) {
		this.open_corporates_URL = open_corporates_URL;
	}

	public String getCorporate_location() {
		return corporate_location;
	}

	public void setCorporate_location(String corporate_location) {
		this.corporate_location = corporate_location;
	}

	public String getPhysical_location() {
		return physical_location;
	}

	public void setPhysical_location(String physical_location) {
		this.physical_location = physical_location;
	}

	private String public_alias;
	
	private String private_alias;
	
	private String more_info;
	
	private String URL;
	
	private String image_URL;
	
	private String open_corporates_URL;
	
	private String corporate_location;
	
	private String physical_location;

}
