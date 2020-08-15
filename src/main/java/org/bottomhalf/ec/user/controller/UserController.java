/**
 * 
 */
package org.bottomhalf.ec.user.controller;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.bottomhalf.ec.user.modelDAO.UserAccount;
import org.bottomhalf.ec.user.modelDAO.Users;
import org.bottomhalf.ec.user.modelVO.UserAccountVO;
import org.bottomhalf.ec.user.serviceIMPL.UserAccountService;
import org.bottomhalf.ec.user.serviceIMPL.UsersService;
import org.bottomhalf.ec.user.utility.UserAccountObjectHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rahman
 *
 */
@RestController
@CrossOrigin
@RequestMapping("/api/auth")
public class UserController {
	
	private static final Logger log = LoggerFactory.getLogger(UserController.class);
	
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired UserAccountService userAccountService;
	@Autowired UsersService userService;
	
	@Autowired UserAccountObjectHandler userAccountObjectHandler;
	@Autowired AuthenticationManager authenticationManager;
	@Autowired PasswordEncoder passwordEncoder;
	
	@PutMapping("registerUserAccount")
	public @ResponseBody UserAccount registerUserAccount(@RequestBody UserAccountVO userAccountVo,
			HttpServletRequest request, HttpServletResponse response) {
		UserAccount userAccountResponse = userAccountService.saveUserAccount(userAccountObjectHandler.getUserAccountObject(userAccountVo),request);
		Users users = userAccountObjectHandler.getUserObject(userAccountVo);
		users.setUserPassword(bCryptPasswordEncoder.encode(users.getUserPassword()));
		userService.saveUserDetail(users);
		return userAccountResponse;
	}
	
	 
	
	@RequestMapping(value= {"/login","/"}, method= {RequestMethod.POST})
	public @ResponseBody String loginPage(HttpServletRequest request, Principal principal,
			HttpSession session, HttpServletResponse response, @RequestParam("username") String userna,
			@RequestParam("password") String user,@RequestParam("_csrf") String usernac) {
		if(principal != null && SecurityContextHolder.getContext().getAuthentication() != null &&
				SecurityContextHolder.getContext().getAuthentication().isAuthenticated()) {
			return "success";
		}else {
			return "fail";
		}
	}

}
