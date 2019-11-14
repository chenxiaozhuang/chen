package com.tckj.tckj.demo.controller;

import com.tckj.tckj.demo.bean.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("/student/")
public class StudentController {
	
	@RequestMapping("show")
	public String show(Model model){

		model.addAttribute("str", "hello spring boot freemarker");
		Student s = new Student();
		s.setId(1);
		s.setName("张三");
		model.addAttribute("stu", s);
		
		java.util.List<Student> students = new ArrayList<>();
		for(int i = 0 ; i < 3; i++){
			Student stu = new Student();
			stu.setId(i);
			stu.setName("stu4444" + i);
			students.add(stu);
		}
		model.addAttribute("students", students);
		return "student";
	}
	
}
