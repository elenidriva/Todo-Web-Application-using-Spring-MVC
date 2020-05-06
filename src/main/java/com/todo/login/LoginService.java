package com.todo.login;

import org.springframework.stereotype.Service;

//We can implement it so, so that it accesses a db and accepts only the valid users.
@Service
public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("Eleni") && password.equals("1");
	}

}