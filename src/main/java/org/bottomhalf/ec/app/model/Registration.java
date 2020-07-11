package org.bottomhalf.ec.app.model;

import java.util.Date;

public class Registration {
	private String firstName,lastName,gender;
	private Date dob;
	private Long mobile;
	public Registration() {
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Registration [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", dob=" + dob
				+ ", mobile=" + mobile + "]";
	}
}
