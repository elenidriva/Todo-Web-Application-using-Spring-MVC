package com.todo.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.todo.model.TodoService;

@Controller
public class DeleteTodoController {
	
	@Autowired
	private TodoService service;

	@RequestMapping(value = "/delete-todo", method = RequestMethod.GET)
	public String removeTodo(@RequestParam int id) {
		service.deleteTodo(id);
		//service.deleteTodo(id);
		//service.addTodo((String) model.get("name"), desc, java.time.LocalDate.now(), (Priority) model.get("priority"), false);
		//model.clear();// to prevent request parameter "name" to be passed
		return "redirect:/list-todos";
	}
	
	
	
	
	
	
	
	
	
}
