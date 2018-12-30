package group32project.hua.dit.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import group32project.hua.dit.entities.Professor;

@Repository
public class ProfessorDAOImpl implements ProfessorDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	@Override
	public List<Professor> getProfessors(String HQLCommand) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<Professor> query = currentSession.createQuery(HQLCommand, Professor.class);
		
		List<Professor> profs = query.getResultList();
		
		return profs;
	}
	
}
