package springboot.services.rest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@Value("${welcome.message}")
	private String welcomeMessage;

	@GetMapping(value = "/welcome")
	public String hello() {

		return this.welcomeMessage;
	}

}
