/**
 * 
 */
package org.bottomhalf.ec.user.serviceIMPL;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.bottomhalf.ec.user.modelDAO.UserAccount;
import org.bottomhalf.ec.user.service.UserAccountIF;
import org.springframework.stereotype.Service;

/**
 * @author rahman
 *
 */
@Service
public class UserAccountService implements UserAccountIF {

	@Override
	public UserAccount saveUserAccount(UserAccount userAccount, HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserAccount> getAllUserAccountList() {
		// TODO Auto-generated method stub
		return null;
	}

}
