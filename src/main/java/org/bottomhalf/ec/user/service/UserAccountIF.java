/**
 * 
 */
package org.bottomhalf.ec.user.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.bottomhalf.ec.user.modelDAO.UserAccount;

/**
 * @author rahman
 *
 */
public interface UserAccountIF {

	UserAccount saveUserAccount(UserAccount userAccount, HttpServletRequest request);
	
	List<UserAccount> getAllUserAccountList();
}
