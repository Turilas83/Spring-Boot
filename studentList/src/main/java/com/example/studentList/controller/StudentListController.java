package com.example.studentList.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.studentList.bean.Student;

@Controller
public class StudentListController {
	@RequestMapping("/hello")
	public String studentHello(Model model) {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Kate", "Cole", "kate.cole@hotmail.com"));
		students.add(new Student("Dan", "Brown", "dantheman@yahoo.com"));
		students.add(new Student("Mike", "Mars", "mars.mike@outlook.com"));
		model.addAttribute("students", students);
		return "index";
	}
}
