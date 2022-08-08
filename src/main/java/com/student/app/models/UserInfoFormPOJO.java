package com.student.app.models;

public class UserInfoFormPOJO {
	
	private String name;
	private String value;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public UserInfoFormPOJO(String name, String value) {
		super();
		this.name = name;
		this.value = value;
	}
	
	

}
