package group32project.hua.dit.dao;

import group32project.hua.dit.entities.Courses;
import group32project.hua.dit.entities.Professor;
import group32project.hua.dit.entities.Publisher;
import group32project.hua.dit.entities.Student;

public interface AdminDAO {
	//add
	public void addProfessor(Professor prof);
	
	public void addPublisher(Publisher publisher);
	
	public void addCourse(Courses course);
	
	public void addStudent(Student student);
	
	//delete
	public void deleteProfessor(int id);
	
	public void deletePublisher(int id);
	
	public void deleteCourse(int id);
	
	public void deleteStudent(int id);
	
	public void updateFunc(String HQLQuery);

}
