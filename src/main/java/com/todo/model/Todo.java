package com.todo.model;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Todo {

	private int id;
	private String title;
	private String description;
	private Priority  priority;
	private Date targetDate;
	boolean isDone;
	
	

	public Todo() {
		super();
	} 
	
	public Todo(int id, String title, String description,Priority priority, Date targetDate, boolean isDone) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.priority = priority;
		this.targetDate = targetDate;
		this.isDone = isDone;
	}

	public int getId() {
		return id;
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
	public Date getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
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
				+", targetDate=" + targetDate + ", isDone=" + isDone + "]";
	}
	
	
	

}
