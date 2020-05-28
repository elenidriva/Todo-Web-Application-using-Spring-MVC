package com.todo.todo;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.todo.model.Todo;
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
	public String addTodo(ModelMap model, @Valid Todo todo, BindingResult result) {
	if (result.hasErrors())
			return "todo";
		
		service.addTodo(todo.getTitle(), todo.getDescription(), todo.getPriority(), todo.getTargetDate());
		// Priority.valueOf(priority), service.addTodo((String) model.get("name"), desc, java.time.LocalDate.now(), (Priority) model.get("priority"), false);
		//model.clear();// to prevent request parameter "name" to be passed
		return "redirect:/list-todos";
	}
}
