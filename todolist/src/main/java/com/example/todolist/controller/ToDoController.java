package com.example.todolist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ToDoController {

	
	@RequestMapping("/")
	public String root() {
		
		return "index";
	}
}
