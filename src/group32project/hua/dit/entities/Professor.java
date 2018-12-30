package group32project.hua.dit.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="professor")
public class Professor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int idJ;
	
	@Column(name="email")
	private String emailJ;
	
	@Column(name="last_name")
	private String lastNameJ;
	
	@Column(name="first_name")
	private String firstNameJ;
	
	@OneToMany(mappedBy="professorJ", cascade= {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH}, fetch=FetchType.LAZY)
	private List<Courses> courses;
	
	public Professor() {
		
	}
	
	public Professor(String emailJ, String lastNameJ, String firstNameJ) {
		this.emailJ = emailJ;
		this.lastNameJ = lastNameJ;
		this.firstNameJ = firstNameJ;
	}


	public int getIdJ() {
		return idJ;
	}

	public void setIdJ(int idJ) {
		this.idJ = idJ;
	}

	public String getEmailJ() {
		return emailJ;
	}

	public void setEmailJ(String emailJ) {
		this.emailJ = emailJ;
	}

	public String getLastNameJ() {
		return lastNameJ;
	}

	public void setLastNameJ(String lastNameJ) {
		this.lastNameJ = lastNameJ;
	}

	public String getFirstNameJ() {
		return firstNameJ;
	}

	public void setFirstNameJ(String firstNameJ) {
		this.firstNameJ = firstNameJ;
	}

	@Override
	public String toString() {
		return "Professor [emailJ=" + emailJ + ", lastNameJ=" + lastNameJ + ", firstNameJ=" + firstNameJ + "]";
	}

	
	
	public List<Courses> getCourses() {
		return courses;
	}

	public void setCourses(List<Courses> courses) {
		this.courses = courses;
	}
	
	
	
}
