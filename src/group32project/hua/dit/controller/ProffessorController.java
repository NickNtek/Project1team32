package group32project.hua.dit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import group32project.hua.dit.dao.BookDAO;
import group32project.hua.dit.dao.CoursesDAO;
import group32project.hua.dit.dao.ProfessorDAO;
import group32project.hua.dit.entities.Book;
import group32project.hua.dit.entities.Courses;
import group32project.hua.dit.entities.Professor;

@Controller
@RequestMapping("/professors")
public class ProffessorController {

	@Autowired
	private ProfessorDAO professorDAO;
	
	@Autowired
	private CoursesDAO coursesDAO;
	
	@Autowired
	private BookDAO bookDAO;
	
	
	//Display professors
	@RequestMapping("/profList")
	public String getAllProfs(Model model) {
		
		List<Professor> profs = professorDAO.getProfessors("from Professor");
		
		model.addAttribute("profs", profs);
		
		return "all-professors";
	}
	
	

	
	//display classes to choose
	@RequestMapping("/courseList")
	public String getClasses(@RequestParam int profId, Model model) {

		List<Courses> courses = coursesDAO.getClasses(profId);
		
		model.addAttribute("courses", courses);
		
		return "professor-courses";
	}
	
	//By Clicking the book (Or a button) print the books to pick
	@RequestMapping("/availableBooks")
	public String printBooks( @RequestParam int position, @RequestParam int courseid, Model model) {
		List<Book> books = bookDAO.getBooks("from Book");
		
		model.addAttribute("books", books);
		model.addAttribute("position", position);
		model.addAttribute("courseid", courseid);
		return "BookList";
	}
	
	//pick a book to link with the class table
	@RequestMapping("/courseBookUpdate")
	public String courseBookUpdate(@RequestParam int position,  @RequestParam int bookid, @RequestParam int courseid, Model model) {
		coursesDAO.changeBook("update Courses set book"+position+"J="+bookid+"where idJ="+courseid);
		return "results/BackToProf";
	}
}
