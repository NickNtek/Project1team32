package group32project.hua.dit.dao;

import java.util.List;

import group32project.hua.dit.entities.Courses;

public interface CoursesDAO {

	public List<Courses> getClasses(int profId);
	
	public List<Courses> getAllClasses();
	
	public void changeBook(String HQL);
}
