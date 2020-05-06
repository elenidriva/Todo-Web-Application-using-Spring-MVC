package com.todo.model;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

	private static List<Todo> todos = new ArrayList<Todo>() {{
			add(new Todo(1,"Physics Homework","Page 28 ex. 1,2,3 ", Priority.HIGH, false));
			add(new Todo(2,"Maths Homework","Page 30 Revision ", Priority.HIGH, false));
	}};
			
	private static int count = 2;
	// We need to have a way to add new Todos, retrieve Todos and delete Todos
	
	public void addTodo(String title, String description, Priority priority, boolean isDone) {
		todos.add(new Todo(++count, title, description, priority, isDone));
		
	}

	public List<Todo> retrieveTodos() { //sort by user if home-schooling app is implemented
		return todos;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
