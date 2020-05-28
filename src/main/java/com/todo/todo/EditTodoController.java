package com.todo.todo;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.todo.model.Todo;
import com.todo.model.TodoService;

@Controller
public class EditTodoController {
	
	@Autowired
	private TodoService service;
	private int editID;
	private String editTitle;
	private String editDescription;
	
	@RequestMapping(value = "/update-todo", method = RequestMethod.GET)
	public String showUpdateTodoPage(@RequestParam int id, @RequestParam String title, @RequestParam String description, ModelMap model ) {
		editID=id;
		editTitle = title;
		editDescription = description;
		model.addAttribute("id", id);
		model.addAttribute("title", title);
		model.addAttribute("description", description);
		//model.addAttribute("title", title); prio
		return "update-todo";
	}
	
	
	
	@RequestMapping(value = "/update-todo", method = RequestMethod.POST)
	public String updateTodo(ModelMap model, @Valid Todo todo,  BindingResult result) {
		if (result.hasErrors()) {

			model.addAttribute("id", editID);
			model.addAttribute("title", editTitle);
			model.addAttribute("description", editDescription);
			return "update-todo";
		}
		service.editTodo(editID, todo.getTitle(), todo.getDescription(), todo.getPriority(), todo.getTargetDate());
		//model.clear();// to prevent request parameter "name" to be passed
		return "redirect:/list-todos";
	}
	
	/*
	@RequestMapping(value = "/update-todo", method = RequestMethod.POST)
	public String updateTodo(@RequestParam int id,@RequestParam String title, @RequestParam String description, @RequestParam (value="priority") String priority) {
		
		service.editTodo(id, title, description, Priority.valueOf(priority));
		//service.addTodo((String) model.get("name"), desc, java.time.LocalDate.now(), (Priority) model.get("priority"), false);
		//model.clear();// to prevent request parameter "name" to be passed
		return "redirect:/list-todos";
	}	
	*/
	
}



