package group32project.hua.dit.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import group32project.hua.dit.entities.Courses;

@Repository
public class CoursesDAOImpl implements CoursesDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	@Override
	public List<Courses> getClasses(int profId) {
		
		Session currentSession= sessionFactory.getCurrentSession();
		
		Query<Courses> query = currentSession.createQuery("from Courses c where c.professorJ.idJ="+profId, Courses.class);
		
		List<Courses> courses = query.getResultList();
		
		return courses;
	}

	@Transactional
	@Override
	public List<Courses> getAllClasses() {
		Session currentSession= sessionFactory.getCurrentSession();
		
		Query<Courses> query = currentSession.createQuery("from Courses", Courses.class);
		
		List<Courses> courses = query.getResultList();
		
		return courses;
	}

	@Transactional
	@Override
	public void changeBook(String HQL) {
		Session currentSession= sessionFactory.getCurrentSession();
		
		currentSession.createQuery(HQL).executeUpdate();
		
		//query.executeUpdate();

	}

}
