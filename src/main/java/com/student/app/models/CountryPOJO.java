package com.student.app.models;

import java.io.Serializable;

public class CountryPOJO implements Serializable{
	
	private String country;
	private String region;
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	
	

}
