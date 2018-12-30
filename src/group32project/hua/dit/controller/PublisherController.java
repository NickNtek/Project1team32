package group32project.hua.dit.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import group32project.hua.dit.dao.BookDAO;
import group32project.hua.dit.dao.PublisherDAO;
import group32project.hua.dit.dao.StudentDAO;
import group32project.hua.dit.entities.Book;
import group32project.hua.dit.entities.Publisher;
import group32project.hua.dit.entities.Student;

@Controller
@RequestMapping("/publisher")
public class PublisherController {
	
	@Autowired
	private PublisherDAO publDAO;
	
	@Autowired
	private BookDAO bookDAO;
	
	@Autowired
	private StudentDAO studentDAO;
	
	@RequestMapping("/list")
	public String getPublishers(Model model){
		List<Publisher> mylist = publDAO.getPublishers();
		
		model.addAttribute("myPublishers",mylist);
		
		return "PublisherList";
	}
	
	
	@RequestMapping("/booklist")
	public String listBooks(Model model) {
		
		List<Book> books = bookDAO.getBooks("from Book");
		
		model.addAttribute("books",books);
		
		return "BookList";
	}
	
	@RequestMapping("/PublisherBooks")
	public String PublisherBookList(@RequestParam int pId, Model model) {
		
		List<Book> books = bookDAO.getBooks("from Book b where b.publisherJ.idJ="+pId);
		
		model.addAttribute("books",books);
		
		return "Publisher-books";
	}
	
	//Method For Changing The Availability On Books
	@RequestMapping("/AvailabilityForm")
	public String AvailabilityForm(@RequestParam int bookID, @RequestParam int publID, Model model) {
		model.addAttribute("BookID", bookID);
		model.addAttribute("PublID", publID);
		return "AvailForm";
	}
	
	@RequestMapping("/AvailabilityUpdate")
	public String AvailabilitUpdate(HttpServletRequest request, Model model) {
		int id = Integer.parseInt(request.getParameter("BookID"));
				
		int availability = Integer.parseInt(request.getParameter("availability"));
				
		int publisher = Integer.parseInt(request.getParameter("publID"));
				
		int Result  = bookDAO.updateBook("Book", id, availability);
		
		model.addAttribute("publ", publisher);
		model.addAttribute("result", Result);
		return  "results/Result";
	}
	
	//student update functions
	
	@RequestMapping("/bookReceivedForm")
	public String bookReceivalForm(@RequestParam int bookID, @RequestParam int publID, @RequestParam int avail, Model model) {
		model.addAttribute("bookID", bookID);
		model.addAttribute("publID", publID);
		model.addAttribute("avail", avail);
		return "student-book-form";
	}
	
	@RequestMapping("/bookReceivedUpdate")
	public String bookReceivedUpdate(HttpServletRequest request, Model model) {
		int bookid = Integer.parseInt(request.getParameter("bookID"));
		int publid = Integer.parseInt(request.getParameter("publID"));
		int availability =  Integer.parseInt(request.getParameter("avail"));
		availability--;
		
		String mail = request.getParameter("email");
		
		int Result  = bookDAO.updateBook("Book", bookid, availability);
		
		Student stud = studentDAO.getStudent(mail);
		int studId = stud.getIdJ();
		int recBook = stud.getRecBooksNoJ();
		recBook++;
		studentDAO.StudentReceived(studId, recBook);
		
		model.addAttribute("publ", publid);
		model.addAttribute("result", Result);
		return  "results/Result";
	}
}
