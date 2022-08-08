package com.student.app.models;

import java.io.Serializable;

public class CountryNewPOJO implements Serializable{
	
	private String country_name;
	
	private String country_short_name;
	
	private String country_phone_code;
	
	

	public String getCountry_name() {
		return country_name;
	}

	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}

	public String getCountry_short_name() {
		return country_short_name;
	}

	public void setCountry_short_name(String country_short_name) {
		this.country_short_name = country_short_name;
	}

	public String getCountry_phone_code() {
		return country_phone_code;
	}

	public void setCountry_phone_code(String country_phone_code) {
		this.country_phone_code = country_phone_code;
	}
	
	

}
