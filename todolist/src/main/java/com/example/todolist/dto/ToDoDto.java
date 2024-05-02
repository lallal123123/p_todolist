package com.example.todolist.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ToDoDto {
	private int dno;
	private String content;
	private String category;
	private String todo;
	private String id;
	
}
