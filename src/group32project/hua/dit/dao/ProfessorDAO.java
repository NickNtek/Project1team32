package group32project.hua.dit.dao;

import java.util.List;

import group32project.hua.dit.entities.Professor;

public interface ProfessorDAO {
	public List<Professor> getProfessors(String HQLCommand);
}
