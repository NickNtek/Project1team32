package group32project.hua.dit.dao;

import java.util.List;

import group32project.hua.dit.entities.Student;

public interface StudentDAO {
	public List<Student> getStudents();

	public List<Student> getStudent(int id);
	
	public  Student getStudent(String email);
	
	public void StudentReceived(int id, int recBook);
}
