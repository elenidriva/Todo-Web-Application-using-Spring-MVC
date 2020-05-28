package com.todo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

	private static List<Todo> todos = new ArrayList<Todo>() {{
			add(new Todo(1,"Physics Homework","Page 28 ex. 1,2,3 ", Priority.LOW, new Date()));
			add(new Todo(2,"Maths Homework","Page 30 Revision\nPage 31 execises ", Priority.HIGH, new Date()));
			add(new Todo(3,"Meeting with mum","Bring all the required papers ", Priority.MEDIUM, new Date()));
	}};
			
	private static int count = 3;
	// We need to have a way to add new Todos, retrieve Todos and delete Todos
	
	public void addTodo(String title, String description, Priority priority, Date targetDate) {		
		todos.add(new Todo(++count, title, description, priority, targetDate));	
		System.out.println(targetDate);
	}

	public List<Todo> retrieveTodos() { //sort by user if home-schooling app is implemented
		return todos;
	}
	
	public Todo deleteTodo(int id) {
		for(int i = 0; i <todos.size(); i++) {
			if(id==todos.get(i).getId()) {
				Todo deletedItem = todos.remove(i);
				return deletedItem;
			}
			
		}
		Todo deletedItem = null;
		return deletedItem;
	}
	
	public Todo editTodo(int id, String title, String description, Priority priority, Date targetDate) {
		for(int i = 0; i <todos.size(); i++) {
			if(id==todos.get(i).getId()) {
				if(!title.equals(todos.get(i).getTitle()))
					todos.get(i).setTitle(title);
				//System.out.println("without / n etc"+ todos.get(i).getTitle());
				//String newTitle = title.replace("\n", "<br />");
				//System.out.println("with / n etc"+ todos.get(i).getTitle());
				if(!description.equals(todos.get(i).getDescription()))
					todos.get(i).setDescription(description);				
				if(!priority.equals(todos.get(i).getPriority()))
					todos.get(i).setPriority(priority);						
				if(!targetDate.equals(todos.get(i).getTargetDate()))
					todos.get(i).setTargetDate(targetDate);		
				
				return todos.get(i);
			}
		}
		return todos.get(id);	
	}
}
