package com.todo.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.todo.model.Todo;
import com.todo.model.Priority;
import com.todo.model.TodoService;

@Controller
public class AddTodoController {

	@Autowired
	private TodoService service;

	@RequestMapping(value = "/add-todo", method = RequestMethod.GET)
	public String showTodoPage() {
		return "todo";
	}
	
	@RequestMapping(value = "/add-todo", method = RequestMethod.POST)
	public String addTodo(@RequestParam String title, @RequestParam String description, @RequestParam (value="priority") String priority) {
		service.addTodo(title, description, Priority.valueOf(priority), false);
		//service.addTodo((String) model.get("name"), desc, java.time.LocalDate.now(), (Priority) model.get("priority"), false);
		//model.clear();// to prevent request parameter "name" to be passed
		return "redirect:/list-todos";
	}
}
