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

/**
 * @author rahman
 *
 */
@Entity
@Table(name="USER_ACCOUNT")
@NamedQuery(name="UserAccount.findAll", query="SELECT ua from UserAccount ua")
public class UserAccount implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="USER_ACCOUNT_ID")
	private Integer userAccountId;
	
	@Column(name="INITIALS")
	private String nameInitials;
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name="EMAIL_ID")
	private String emailId;
		
	@Column(name="ACCOUNT_TYPE")
	private String accountType;
	
	@Column(name="ACCOUNT_STATUS")
	private String accountStatus;
	
	@Column(name="CREATED_DATE")
	private Timestamp createdDate;
	
	@Column(name="UPDATED_DATE")
	private Timestamp updatedDate;

	public Integer getUserAccountId() {
		return userAccountId;
	}

	public void setUserAccountId(Integer userAccountId) {
		this.userAccountId = userAccountId;
	}

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

	@Override
	public String toString() {
		return "UserAccount [userAccountId=" + userAccountId + ", nameInitials=" + nameInitials + ", firstName="
				+ firstName + ", lastName=" + lastName + ", emailId=" + emailId + ", accountType=" + accountType
				+ ", accountStatus=" + accountStatus + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate
				+ "]";
	}

	

}
