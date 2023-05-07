package lk.ccs.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lk.ccs.model.Student;

@Controller
public class StudentController {
	
	@SuppressWarnings("deprecation")
	@GetMapping("/student")
	public String getStudent(Model model) {
		
		Student student = new Student();
		student.setSid(4480);
		student.setFirstName("Mohamed");
		student.setLastName("Aqeel");
		student.setDob(new Date(1980, 1, 18));
		
		model.addAttribute("student", student);
		return "student";
	}
	
}
