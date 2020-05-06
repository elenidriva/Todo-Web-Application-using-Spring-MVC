package com.todo.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

// SessionAttributes to persist while view-agnostic
@Controller
@SessionAttributes("name")
public class LoginController {
	
	//Automatically connects it to the LoginService class. We add "service" to LoginService
	//Add servlet-mapping to path correctly in web.xml
	@Autowired
	private LoginService loginService;
	
	//We map the web application to display the login.jsp with GET request
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String showLoginPage() {
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String handleUserLogin(ModelMap model, @RequestParam String name, @RequestParam String password) {
		
		if (!loginService.validateUser(name, password)) {
			model.put("errorMessage", "Invalid Credentials. Try again!");
			return "login";
		}
		
		model.put("name", name);
		return "welcome";
		
		}

	
	
	
	
	
}
