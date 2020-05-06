package com.todo.model;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Todo {

	private int id;
	private String title;
	private String description;
	private Priority  priority;
	//Date targetDate;
	boolean isDone;
	
	
	public int getId() {
		return id;
	}
	public Todo(int id, String title, String description,Priority priority, boolean isDone) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.priority = priority;

		this.isDone = isDone;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Priority getPriority() {
		return priority;
	}
	public void setPriority(Priority priority) {
		this.priority = priority;
	}
	
	public boolean isDone() {
		return isDone;
	}
	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}
	@Override
	public String toString() {
		return "Todo [id=" + id + ", title=" + title + ", description=" + description + ", priority=" + priority
				+ ", isDone=" + isDone + "]";
	}
	
	
	

}
