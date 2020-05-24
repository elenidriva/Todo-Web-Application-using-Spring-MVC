package com.todo.security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.LogoutHandler;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class CustomLogoutHandler implements LogoutHandler {
	public String logout1(HttpServletRequest request, HttpServletResponse response) {

    		Authentication auth = SecurityContextHolder.getContext()
    				.getAuthentication();
    		if (auth != null) {
    			new SecurityContextLogoutHandler().logout(request, response, auth);
    		}
    		return "/login1";

    }

	@Override
	public void logout(HttpServletRequest request, HttpServletResponse response, Authentication authentication) {

		if (authentication != null) {
			new SecurityContextLogoutHandler().logout(request, response, authentication);
		}
		logout1(request, response);
		
	}
}