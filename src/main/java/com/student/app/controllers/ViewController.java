package com.student.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.student.app.entity.StudentInfo;
import com.student.app.service.StudService;

@Controller
@RequestMapping("/view")
public class ViewController {
	
//	private StudService studService;
	
//	Constructor dependency injection below
//	public ViewController(StudService studService) {
//		super();
//		this.studService = studService;
//	}

//	@GetMapping("/form")
//	public String sample() {
//		
//		return "form";
//	}
	
//	@GetMapping("/students")
//	public String listofStudents(Model model) {
//		
//		model.addAttribute("students", studService.getAllStudents());
//		return "students";
//	}
	
	@GetMapping("/addStudent")
	public String createStudent() {

		return "newStudent";
	}
	
	@GetMapping("/students")
	public String showStudents() {

		return "students";
	}
	@GetMapping("/updateStudent")
	public String updateStudent() {

		return "update";
	}
	
}
