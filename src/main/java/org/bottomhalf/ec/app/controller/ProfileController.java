package org.bottomhalf.ec.app.controller;

import org.bottomhalf.ec.app.model.Login;
import org.bottomhalf.ec.app.model.Registration;
import org.bottomhalf.ec.app.model.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/")
public class ProfileController {
	@GetMapping(value="login")
	public Response login(@RequestBody Login login) {
		return Response.ok(null,"Login Successful!");
	}
	
	@PostMapping(value="registration")
	public Response registration(@RequestBody Registration registration) {
		return Response.ok(null, "reg");
	}
	
	@GetMapping(value = "test")
	public String Test() {
		return "Hello user";
	}
}
