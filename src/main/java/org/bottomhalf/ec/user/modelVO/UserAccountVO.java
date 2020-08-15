package org.bottomhalf.ec.user.modelVO;

import javax.persistence.Column;

public class UserAccountVO {

	private String nameInitials;
	private String firstName;
	private String lastName;
	private String emailId;
	private String userName;
	private String accountType;
	private String accountStatus;
	private String userPassword;
	private Boolean userPasswordHint;
	private String userPasswordQuestion;
	private String userPasswordAnswer;
	private String ipAddress;
	public String getNameInitials() {
		return nameInitials;
	}
	public void setNameInitials(String nameInitials) {
		this.nameInitials = nameInitials;
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
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	public Boolean getUserPasswordHint() {
		return userPasswordHint;
	}
	public void setUserPasswordHint(Boolean userPasswordHint) {
		this.userPasswordHint = userPasswordHint;
	}
	public String getUserPasswordQuestion() {
		return userPasswordQuestion;
	}
	public void setUserPasswordQuestion(String userPasswordQuestion) {
		this.userPasswordQuestion = userPasswordQuestion;
	}
	public String getUserPasswordAnswer() {
		return userPasswordAnswer;
	}
	public void setUserPasswordAnswer(String userPasswordAnswer) {
		this.userPasswordAnswer = userPasswordAnswer;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	@Override
	public String toString() {
		return "UserAccountVO [nameInitials=" + nameInitials + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", emailId=" + emailId + ", userName=" + userName + ", accountType=" + accountType
				+ ", accountStatus=" + accountStatus + ", userPassword=" + userPassword + ", userPasswordHint="
				+ userPasswordHint + ", userPasswordQuestion=" + userPasswordQuestion + ", userPasswordAnswer="
				+ userPasswordAnswer + ", ipAddress=" + ipAddress + "]";
	}
	
}
