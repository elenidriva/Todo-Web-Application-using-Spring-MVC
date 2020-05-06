package com.todo.todo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.todo.model.Priority;
import com.todo.model.Todo;
import com.todo.model.TodoService;

@Controller
@SessionAttributes("name")
public class TodoController {

	@Autowired
	private TodoService service;

	@RequestMapping(value = "/list-todos", method = RequestMethod.GET)
	public String showTodosList(ModelMap model) {
		//String user = (String) model.get("name");
		model.addAttribute("todos", service.retrieveTodos());
		return "list-todos";
	}
	
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
	
	@RequestMapping(value = "/delete-todo", method = RequestMethod.GET)
	public String removeTodo(@RequestParam int id) {
		service.deleteTodo(id);
		//service.deleteTodo(id);
		//service.addTodo((String) model.get("name"), desc, java.time.LocalDate.now(), (Priority) model.get("priority"), false);
		//model.clear();// to prevent request parameter "name" to be passed
		return "redirect:/list-todos";
	}
	
	/*@RequestMapping(value = "/delete-todo/${id}", method = RequestMethod.GET)
	public String removeTodo(@PathVariable ("id") int id, Model model) {
		
		System.out.println(id);
		//service.deleteTodo(id);
		//service.addTodo((String) model.get("name"), desc, java.time.LocalDate.now(), (Priority) model.get("priority"), false);
		//model.clear();// to prevent request parameter "name" to be passed
		return "redirect:/list-todos";
	} */
}