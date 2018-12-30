package group32project.hua.dit.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Courses {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int idJ;
	
	@Column(name="title")
	private String titleJ;
	
	@ManyToOne(cascade={CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH}, fetch=FetchType.LAZY)
	@JoinColumn(name="professor_id")
	private Professor professorJ;
	
	@OneToOne(cascade={CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name="book_1")
	private Book book1J;
	
	@OneToOne(cascade={CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name="book_2")
	private Book book2J;

	
	public Courses(String titleJ, int professor, Book book1j, Book book2j) {
		this.titleJ = titleJ;
		this.professorJ.setIdJ(professor);
		book1J = book1j;
		book2J = book2j;
	}

	public Courses() {
		
	}

	public int getIdJ() {
		return idJ;
	}

	public void setIdJ(int idJ) {
		this.idJ = idJ;
	}

	public String getTitleJ() {
		return titleJ;
	}

	public void setTitleJ(String titleJ) {
		this.titleJ = titleJ;
	}

	public Professor getProfessor() {
		return professorJ;
	}

	public void setProfessor(Professor professor) {
		this.professorJ = professor;
	}

	public Book getBook1J() {
		return book1J;
	}

	public void setBook1J(Book book1j) {
		book1J = book1j;
	}

	public Book getBook2J() {
		return book2J;
	}

	public void setBook2J(Book book2j) {
		book2J = book2j;
	}

	@Override
	public String toString() {
		return "Courses [idJ=" + idJ + ", titleJ=" + titleJ + ", professor=" + professorJ + ", book1J=" + book1J
				+ ", book2J=" + book2J + "]";
	}

	
}
