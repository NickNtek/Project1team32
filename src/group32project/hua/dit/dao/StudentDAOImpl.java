package group32project.hua.dit.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import group32project.hua.dit.entities.Student;

@Repository
public class StudentDAOImpl implements StudentDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	@Override
	public List<Student> getStudents() {
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<Student> query = currentSession.createQuery("from Student", Student.class);
		
		List<Student> students = query.getResultList();
		
		return students;
	}

	@Override
	@Transactional
	public List<Student> getStudent(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<Student> query = currentSession.createQuery("from Student where id="+id, Student.class);
		
		List<Student> student = query.getResultList();
		
		return student;
	}
	
	
	
	@Override
	@Transactional
	public void StudentReceived(int id, int recBook) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query query = currentSession.createQuery("update Student set recBooksNoJ="+recBook+"where idJ="+id);
		query.executeUpdate();
		
	}

	@Override
	@Transactional
	public Student getStudent(String email) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<Student> query = currentSession.createQuery("from Student where emailJ="+email, Student.class);
		
		Student student = query.getSingleResult();
		
		return student;
	}

}
