package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.StudentService;
import com.example.demo.model.Student;


@RestController
public class StudentController {

	@Autowired
	StudentService sser;
	
	@PostMapping("students")
	public Student addStudent(@RequestBody Student ss) {
		return sser.saveinfo(ss);
	}
	
	
	@GetMapping("details")
	public List<Student>showDetails(){
		return sser.showinfo();
	}
}
