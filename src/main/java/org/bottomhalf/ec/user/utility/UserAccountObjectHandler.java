/**
 * 
 */
package org.bottomhalf.ec.user.utility;

import org.bottomhalf.ec.user.modelDAO.UserAccount;
import org.bottomhalf.ec.user.modelDAO.Users;
import org.bottomhalf.ec.user.modelVO.UserAccountVO;
import org.springframework.stereotype.Component;

/**
 * @author rahman
 *
 */
@Component
public class UserAccountObjectHandler {

	public UserAccount getUserAccountObject(UserAccountVO userAccountVo) {
		UserAccount userAccount= new UserAccount();
		if(null != userAccountVo.getFirstName() && !userAccountVo.getFirstName().isEmpty()) {
			userAccount.setFirstName(userAccountVo.getFirstName());
		}
		if(null != userAccountVo.getLastName() && !userAccountVo.getLastName().isEmpty()) {
			userAccount.setLastName(userAccountVo.getLastName());
		}
		if(null != userAccountVo.getEmailId() && !userAccountVo.getEmailId().isEmpty()) {
			userAccount.setEmailId(userAccountVo.getEmailId());
		}
		if(null != userAccountVo.getAccountType() && !userAccountVo.getAccountType().isEmpty()) {
			userAccount.setAccountType(userAccountVo.getAccountType());
		}
		return userAccount;
	}
	
	public Users getUserObject(UserAccountVO userAccountVo) {
		Users users = new Users();
		if(null != userAccountVo.getUserPassword() && !userAccountVo.getUserPassword().isEmpty()) {
			users.setUserPassword(userAccountVo.getUserPassword());
		}
		if(null != userAccountVo.getUserPasswordHint()) {
			users.setUserPasswordHint(userAccountVo.getUserPasswordHint());
		}
		if(null != userAccountVo.getUserPasswordQuestion() && !userAccountVo.getUserPasswordQuestion().isEmpty()) {
			users.setUserPasswordQuestion(userAccountVo.getUserPasswordQuestion());
		}
		if(null != userAccountVo.getUserPasswordAnswer() && !userAccountVo.getUserPasswordAnswer().isEmpty()) {
			users.setUserPasswordAnswer(userAccountVo.getUserPasswordAnswer());
		}
		if(null != userAccountVo.getUserName() && !userAccountVo.getUserName().isEmpty()) {
			users.setUserName(userAccountVo.getUserName());
		}
		return users;
	}

}
