package com.todo.security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.LogoutHandler;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;

public class CustomLoginHandler implements LogoutHandler { 

	public String login1(HttpServletRequest request, HttpServletResponse response) {

		Authentication auth = SecurityContextHolder.getContext()
				.getAuthentication();
		if (auth != null) {
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		return "/logout1";

}
	
@Override
public void logout(HttpServletRequest request, HttpServletResponse response, Authentication authentication) {
	if (authentication != null) {
		new SecurityContextLogoutHandler().logout(request, response, authentication);
	}
	login1(request, response);// TODO Auto-generated method stub
	
}
}
