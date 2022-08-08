package com.student.app.models;

import java.io.Serializable;
import java.util.Map;

public class CountriesPOJO implements Serializable{

	private String status;
	private int statuscode;
	private String version;
	private String access;
	
	private Map<String, CountryPOJO> data;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getStatuscode() {
		return statuscode;
	}

	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getAccess() {
		return access;
	}

	public void setAccess(String access) {
		this.access = access;
	}

	public Map<String, CountryPOJO> getData() {
		return data;
	}

	public void setData(Map<String, CountryPOJO> data) {
		this.data = data;
	}
	
	
	
}
