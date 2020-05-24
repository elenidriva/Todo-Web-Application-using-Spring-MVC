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
			add(new Todo(1,"Physics Homework","Page 28 ex. 1,2,3 ", Priority.MEDIUM, new Date(), false));
			add(new Todo(2,"Maths Homework","Page 30 Revision ", Priority.HIGH, new Date(), false));
	}};
			
	private static int count = 2;
	// We need to have a way to add new Todos, retrieve Todos and delete Todos
	
	public void addTodo(String title, String description, Priority priority, Date targetDate, boolean isDone) {		
		todos.add(new Todo(++count, title, description, priority, targetDate, isDone));	
		System.out.println(targetDate);
	}
	
	/*public void editTodo(int id, String title, String description, Priority priority, boolean isDone) {		
		
		for(int i = 0; i <todos.size(); i++) {
			if(id==todos.get(i).getId()) {
				//todos.add(new Todo(id, title, description, priority, isDone));
				todos.get(id).setDescription(description);
				todos.get(id).setTitle(title);
				todos.get(id).setPriority(priority);
				System.out.println(todos.get(i));
			}
		}
	
	}
	*/

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
	
	public Todo editTodo(int id, String title, String description, Priority priority) {
		for(int i = 0; i <todos.size(); i++) {
			if(id==todos.get(i).getId()) {
				if(!title.equals(todos.get(i).getTitle()))
					//System.out.println("without / n etc"+ todos.get(i).getTitle());
				//String newTitle = title.replace("\n", "<br />");
					todos.get(i).setTitle(title);
					//System.out.println("with / n etc"+ todos.get(i).getTitle());

				if(!description.equals(todos.get(i).getDescription()))
					todos.get(i).setDescription(description);
				if(!priority.equals(todos.get(i).getPriority()))
					todos.get(i).setPriority(priority);		
				return todos.get(i);
			}
		}
		return todos.get(id);	
	}
}
