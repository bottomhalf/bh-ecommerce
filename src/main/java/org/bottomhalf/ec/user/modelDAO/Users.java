/**
 * 
 */
package org.bottomhalf.ec.user.modelDAO;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

/**
 * @author rahman
 *
 */
@Entity
@Table(name="USERS")
@NamedQuery(name="Users.findAll", query="SELECT ua from Users ua")
public class Users implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="USER_ID")
	private Integer userId;
	
	@Column(name="USER_ACCOUNT_ID")
	@NonNull
	private Integer userAccountId;
	
	@Column(name="USER_PASSWORD")
	@NonNull
	private String userPassword;
	
	@Column(name="USER_NAME")
	private String userName;
	
	@Column(name="USER_PASSWORD_HINT")
	private boolean userPasswordHint;
	
	@Column(name="USER_PASSWORD_QUESTION")
	private String userPasswordQuestion;
	
	@Column(name="USER_PASSWORD_ANSWER")
	private String userPasswordAnswer;
	
	@Column(name="SESSION_ID")
	private String sessionId;
	
	@Column(name="LOGIN_ATTEMPT_COUNT")
	private int loginAttemptCount;
	
	@Column(name="IP_ADDRESS")
	private String ipAddress;
	
	@Column(name="STATUS")
	private String status;
	
	@Column(name="CREATED_DATE")
	private Timestamp createdDate;
	
	@Column(name="UPDATED_DATE")
	private Timestamp updatedDate;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getUserAccountId() {
		return userAccountId;
	}

	public void setUserAccountId(Integer userAccountId) {
		this.userAccountId = userAccountId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public boolean isUserPasswordHint() {
		return userPasswordHint;
	}

	public void setUserPasswordHint(boolean userPasswordHint) {
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

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public int getLoginAttemptCount() {
		return loginAttemptCount;
	}

	public void setLoginAttemptCount(int loginAttemptCount) {
		this.loginAttemptCount = loginAttemptCount;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public Timestamp getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Timestamp updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userAccountId=" + userAccountId + ", userPassword=" + userPassword
				+ ", userName=" + userName + ", userPasswordHint=" + userPasswordHint + ", userPasswordQuestion="
				+ userPasswordQuestion + ", userPasswordAnswer=" + userPasswordAnswer + ", sessionId=" + sessionId
				+ ", loginAttemptCount=" + loginAttemptCount + ", ipAddress=" + ipAddress + ", createdDate="
				+ createdDate + ", updatedDate=" + updatedDate + "]";
	}

	
}
