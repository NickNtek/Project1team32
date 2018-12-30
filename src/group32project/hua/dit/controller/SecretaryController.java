package group32project.hua.dit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import group32project.hua.dit.dao.StudentDAO;
import group32project.hua.dit.entities.Student;

@Controller
@RequestMapping("/secretary")
public class SecretaryController {

	@Autowired
	private StudentDAO studentDAO;
	
	//Print students and the received books and display how many days until deadline
	@RequestMapping("/studentList")
	public String StudentList(Model model) {
		List<Student> students = studentDAO.getStudents();
		
		model.addAttribute("students", students);
		
		return "secretary-view";
	}

	
	//sent mail by button
}
