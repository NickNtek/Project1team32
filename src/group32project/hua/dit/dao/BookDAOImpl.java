package group32project.hua.dit.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import group32project.hua.dit.entities.Book;

@Repository
public class BookDAOImpl implements BookDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Book> getBooks(String HQLCommand) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<Book> query = currentSession.createQuery(HQLCommand, Book.class);
		
		List<Book> books = query.getResultList();
		
		return books;
	}

	@Override
	@Transactional
	public int updateBook(String tableName, int id, int newValue) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query query = currentSession.createQuery("update "+tableName+" set availableJ="+newValue+"where id= "+id);
		int result = query.executeUpdate();
		return result;
		
	}

	
	
	
}
