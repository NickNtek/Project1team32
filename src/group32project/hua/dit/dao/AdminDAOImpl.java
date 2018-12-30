package group32project.hua.dit.dao;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import group32project.hua.dit.entities.Courses;
import group32project.hua.dit.entities.Professor;
import group32project.hua.dit.entities.Publisher;
import group32project.hua.dit.entities.Student;

@Repository
public class AdminDAOImpl implements AdminDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	@Override
	public void addPublisher(Publisher publisher) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		currentSession.save(publisher);
		
	}

	@Transactional
	@Override
	public void addProfessor(Professor prof) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		currentSession.save(prof);
		
	}

	@Transactional
	@Override
	public void addCourse(Courses course) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		currentSession.save(course);
		
	}

	@Transactional
	@Override
	public void addStudent(Student student) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		currentSession.save(student);
		
	}

	@Transactional
	@Override
	public void deleteProfessor(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		Professor prof = currentSession.get(Professor.class, id);
		currentSession.delete(prof);
		
	}

	@Transactional
	@Override
	public void deletePublisher(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		Publisher publisher = currentSession.get(Publisher.class, id);
		currentSession.delete(publisher);
	}

	@Transactional
	@Override
	public void deleteCourse(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		Courses course = currentSession.get(Courses.class, id);
		currentSession.delete(course);
	}

	@Transactional
	@Override
	public void deleteStudent(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		Student student = currentSession.get(Student.class, id);
		currentSession.delete(student);
		
	}

	@Transactional
	@Override
	public void updateFunc(String HQLQuery) {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		Query query = currentSession.createQuery(HQLQuery);
		query.executeUpdate();
	}

}
