package org.bottomhalf.ec.app.controller;

import org.bottomhalf.ec.app.model.JwtRequest;
import org.bottomhalf.ec.app.model.JwtResponse;
import org.bottomhalf.ec.app.security.JwtTokenUtility;
import org.bottomhalf.ec.app.service.JwtUserDetailsService;
import org.hibernate.boot.model.relational.SimpleAuxiliaryDatabaseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class AuthenticationController {

	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private JwtTokenUtility jwtTokenUtility;
	
	@Autowired
	private JwtUserDetailsService userDetailsService;
	
	@RequestMapping(value="/authenticate", method = RequestMethod.POST)
	public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest autheticationRequest) throws Exception{
		authenticate(autheticationRequest.getUsername(), autheticationRequest.getPassword());
		
		final UserDetails userDetails = userDetailsService.loadUserByUsername(autheticationRequest.getUsername());
		final String token = jwtTokenUtility.generateTokenForUser(userDetails);
		
		return ResponseEntity.ok(new JwtResponse(token));
	}

	private void authenticate(String username, String password) throws Exception {
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
		}
		catch(DisabledException e) {
			throw new Exception("USER_DISABLED", e);
		}
		catch(BadCredentialsException e) {
			throw new Exception ("INVALID_CREDENTIALS", e);
		}
	}
}
