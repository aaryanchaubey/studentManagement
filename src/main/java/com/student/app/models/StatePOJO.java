package com.student.app.models;

import java.io.Serializable;

public class StatePOJO implements Serializable{
	
	private String state_name;

	public String getState_name() {
		return state_name;
	}

	public void setState_name(String state_name) {
		this.state_name = state_name;
	}
	
	
}
