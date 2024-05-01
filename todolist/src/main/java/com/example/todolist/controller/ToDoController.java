package com.example.todolist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ToDoController {

	
	@RequestMapping("/")
	public @ResponseBody String root() {
		
		return "초기 설정 성공";
	}
}
