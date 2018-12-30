package group32project.hua.dit.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import group32project.hua.dit.entities.Publisher;

@Repository
public class PublisherDAOImpl implements PublisherDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	@Override
	public List<Publisher> getPublishers() {
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<Publisher> query = currentSession.createQuery("from Publisher", Publisher.class);
		
		List<Publisher> publishers = query.getResultList();
		
		return publishers;
	}

	@Transactional
	@Override
	public List<Publisher> getPublisher(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<Publisher> query = currentSession.createQuery("from Publisher where idJ="+id, Publisher.class);
		
		List<Publisher> publisher = query.getResultList();
		return publisher;
	}

}
