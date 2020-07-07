package com.bibhu.first.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bibhu.first.entities.Users;
import com.bibhu.first.repository.UserRepository;

@Controller
public class UserController {
	@Autowired
	private UserRepository userRepository;
	private static Logger logger = LoggerFactory.getLogger(UserController.class);

//Logger.getLogger(UserController.class);
	@GetMapping("/")
	public String first() {
		//System.out.println("Hello world");
		logger.info("inside default url ");
		return "first";
	}

	@GetMapping("/second")
	public String second() {
		return "login/userRegistration";
	}

	@PostMapping("/insert")
	public String insert(@ModelAttribute("users") Users user) {
		//System.out.println("Hello one");
		logger.info("inside inser method of userController");
		userRepository.save(user);
		// model.addAttribute("user", user1);
		return "login/registered";
	}

	@GetMapping("/login")
	public String login() {
		return "login/registered";
	}

	@GetMapping(path = "/getUser/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Users getUser(@PathVariable("id") Long id) {
		return userRepository.getOne(id);
	}

	@PostMapping("/flight")
	public String findFlight(@RequestParam("email") String email, @RequestParam("password") String password,
			ModelMap model) {
		// System.out.println("Hello word 0");
		logger.error("Error mesage");
		logger.warn("warn message");
		logger.info("Info message");
		
		logger.debug("debug message");
		logger.trace("trace message");
		Users user = userRepository.findByEmail(email);

		System.out.println("Hello 1");

		System.out.println(user.getPassword() + " ..... " + password);

		if (user.getPassword().equals(password)) {
			System.out.println("Hello 2");

			return "login/findFlights";
		} else {

			model.addAttribute("msg", "you have given incorrecct password or email");

			System.out.println("Hello 3");

		}
		return "login/registered";

	}

}
