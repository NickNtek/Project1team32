package group32project.hua.dit.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import group32project.hua.dit.dao.AdminDAO;
import group32project.hua.dit.dao.CoursesDAO;
import group32project.hua.dit.dao.ProfessorDAO;
import group32project.hua.dit.dao.PublisherDAO;
import group32project.hua.dit.dao.StudentDAO;
import group32project.hua.dit.entities.Courses;
import group32project.hua.dit.entities.Professor;
import group32project.hua.dit.entities.Publisher;
import group32project.hua.dit.entities.Student;

@Controller
@RequestMapping("/admin")
public class AdministratorController {
	
	@Autowired
	private AdminDAO adminDAO;
	
	@Autowired
	private ProfessorDAO profDAO;
	
	@Autowired
	private CoursesDAO courseDAO;
	
	@Autowired
	private StudentDAO studentDAO;
	
	@Autowired
	private PublisherDAO publisherDAO;
	
	
	//display actions
	@RequestMapping("/")
	public String displayActions() {
		return "admin-actions";
	}
	
	//Add User
	@RequestMapping("/addUserForm")
	public String addUser(HttpServletRequest request, Model model) {
		int optionValue = Integer.parseInt(request.getParameter("user"));
		if(optionValue==1) {      //add Professor
			return "forms/AddProfessor";
		}else if(optionValue==2) {//add Publisher
			return "forms/AddPublisher";
		}else if(optionValue==3) {//Add Course
			List<Professor> profList = profDAO.getProfessors("from Professor");
			model.addAttribute("profList", profList);
			return "forms/AddCourse";
		}else if(optionValue==4) {//Add Student
			return "forms/AddStudent";
		}else {
			return "error-file";
		}
	}
	
	@RequestMapping("/addProfessor")
	public String addProfessor(HttpServletRequest request, Model model) {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		
		Professor prof = new Professor(email, lastName, firstName);
		
		adminDAO.addProfessor(prof);
		
		return "admin-actions";
	}
	
	@RequestMapping("/addPublisher")
	public String addPublisher(HttpServletRequest request, Model model) {
		String name = request.getParameter("name");
		String location = request.getParameter("loc");
		String instructions = request.getParameter("instr");
		
		Publisher publisher= new Publisher(name, location, instructions);
		
		adminDAO.addPublisher(publisher);
		
		return "admin-actions";
	}
	
	@RequestMapping("/addCourse")
	public String addCourse(HttpServletRequest request, Model model) {
		String title = request.getParameter("title");
		int professor = Integer.parseInt(request.getParameter("professor"));
		
		Courses course= new Courses(title, professor, null, null);
		
		adminDAO.addCourse(course);
		
		return "admin-actions";
	}
	
	@RequestMapping("/addStudent")
	public String addStudent(HttpServletRequest request, Model model) {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		int semester = Integer.parseInt(request.getParameter("semester"));
		int ClassesNo = Integer.parseInt(request.getParameter("classesNo"));
		
		Student student = new Student(email, name, semester, ClassesNo, 0);
		
		adminDAO.addStudent(student);
		
		return "admin-actions";
	}
	
	//show all users
	@RequestMapping("/adminUsersView")
	public String showAllUsers(Model model) {
		List<Professor> profs = profDAO.getProfessors("from Professor");
		List<Courses> course = courseDAO.getAllClasses();
		List<Publisher> publs = publisherDAO.getPublishers();
		List<Student> studs = studentDAO.getStudents();
		
		model.addAttribute("profs", profs);
		model.addAttribute("course", course);
		model.addAttribute("publs", publs);
		model.addAttribute("studs", studs);
		
		return "admin-users-view";
	}
		
		
	//Update User
	@RequestMapping("/updateProfessorForm")
	public String updateProForm(@RequestParam int id, Model model) {
		List<Professor> profs = profDAO.getProfessors("from Professor f where f.idJ="+id);
		model.addAttribute("profs", profs);
		return "forms/updateProForm";
	}
	
	@RequestMapping("/updateProfessor")
	public String UpdateProfessor(HttpServletRequest request, Model model) {
		int  id = Integer.parseInt(request.getParameter("id"));
		String firstName = request.getParameter("fname");
		String lastName = request.getParameter("lname");
		String email = request.getParameter("email");
		
		String query = "update Professor set firstNameJ="+firstName+", lastNameJ="+lastName+", emailJ='"+email+"' where idJ="+id;
		adminDAO.updateFunc(query);
		return "admin-actions";
	}
	
	@RequestMapping("/updateCoursesForm")
	public String updateCourseForm(@RequestParam int id, Model model) {
		List<Professor> profs = profDAO.getProfessors("from Professor");
		List<Courses> courses = courseDAO.getClasses(id);
		model.addAttribute("courses", courses);
		model.addAttribute("profs", profs);
		return "forms/updateCourseForm";
	}
	
	@RequestMapping("/updateCourse")
	public String updateCourse(HttpServletRequest request, Model model) {
		int  id = Integer.parseInt(request.getParameter("id"));
		String title = request.getParameter("title");
		int professor_id = Integer.parseInt(request.getParameter("Professor"));
		
		String query = "update Course set titleJ="+title+", professorJ="+professor_id+" where idJ="+id;
		adminDAO.updateFunc(query);
		return "admin-actions";
	}
	
	
	//update Publisher
	@RequestMapping("/updatePublisherForm")
	public String updatePublisherForm(@RequestParam int id, Model model) {
		List<Publisher> publishers = publisherDAO.getPublisher(id);
		model.addAttribute("publishers", publishers);
		return "forms/updatePublisherForm";
	}
	
	@RequestMapping("/updatePublisher")
	public String updatePublisher(HttpServletRequest request, Model model) {
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String location = request.getParameter("location");
		String instructions = request.getParameter("instructions");
		
		String query = "update Publisher set nameJ='"+name+"', locationJ='"+location+"', instructionsJ='"+instructions+"' where idJ="+id;
		
		adminDAO.updateFunc(query);
		return "admin-actions";
	}
	
	//Update Student
	@RequestMapping("/updateStudentForm")
	public String updateStudentForm(@RequestParam int id, Model model) {
		List<Student> student = studentDAO.getStudent(id);
		model.addAttribute("student", student);
		return "forms/updateStudentForm";
	}
	
	@RequestMapping("/updateStudent")
	public String updateStudent(HttpServletRequest request, Model model) {
		int id = Integer.parseInt(request.getParameter("id"));
		String studentName = request.getParameter("student");
		String email = request.getParameter("email");
		int semester = Integer.parseInt(request.getParameter("semester"));
		int classesNo = Integer.parseInt(request.getParameter("NoClasses"));
		int noReceived = Integer.parseInt(request.getParameter("NoReceived"));
		
		String query ="update Student set emailJ="+email+", studentNameJ="+studentName+", semesterJ"+semester+", classesNoJ="+classesNo+", recBooksNoJ="+noReceived+"where idj="+id;
		adminDAO.updateFunc(query);
		return "admin-actions";
	}
	
	
	
	
	
	//Delete User
	
	@RequestMapping("/deleteProfessor")
	public String deleteProfessor(@RequestParam int id, Model model) {
		adminDAO.deleteProfessor(id);
		return "admin-actions";
	}
	
	@RequestMapping("/deleteCourse")
	public String deleteCourse(@RequestParam int id, Model model) {
		adminDAO.deleteCourse(id);
		return "admin-actions";
	}
	
	@RequestMapping("/deletePublisher")
	public String deletePublisher(@RequestParam int id, Model model) {
		adminDAO.deletePublisher(id);
		return "admin-actions";
	}
	
	@RequestMapping("/deleteStudent")
	public String deleteStudent(@RequestParam int id, Model model) {
		adminDAO.deleteStudent(id);
		return "admin-actions";
	}
	
}
