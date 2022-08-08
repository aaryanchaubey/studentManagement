package com.student.app.models;

import java.io.Serializable;

public class StudentPOJO implements Serializable{

	
	private String firstname;
	private String lastname;
	private Long contact;
	private String email;
	private String country;
	private String state;
	private String city;
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Long getContact() {
		return contact;
	}
	public void setContact(Long contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "StudentPOJO [firstname=" + firstname + ", lastname=" + lastname + ", contact=" + contact + ", email="
				+ email + ", country=" + country + ", state=" + state + ", city=" + city + "]";
	}
	
	
}
