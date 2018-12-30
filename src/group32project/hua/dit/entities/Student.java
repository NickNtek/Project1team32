package group32project.hua.dit.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int idJ;
	
	@Column(name="email")
	private String emailJ;
	
	@Column(name="name")
	private String studentNameJ;
	
	@Column(name="semester")
	private int semesterJ;
	
	@Column(name="number_of_classes")
	private int classesNoJ;
	
	@Column(name="number_of_received_books")
	private int recBooksNoJ;

	
	public Student(String emailJ, String studentNameJ, int semesterJ, int classesNoJ, int recBooksNoJ) {
		this.emailJ = emailJ;
		this.studentNameJ = studentNameJ;
		this.semesterJ = semesterJ;
		this.classesNoJ = classesNoJ;
		this.recBooksNoJ = recBooksNoJ;
	}
	
	public Student() {
		
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

	public String getStudentNameJ() {
		return studentNameJ;
	}

	public void setStudentNameJ(String studentNameJ) {
		this.studentNameJ = studentNameJ;
	}

	public int getSemesterJ() {
		return semesterJ;
	}

	public void setSemesterJ(int semesterJ) {
		this.semesterJ = semesterJ;
	}

	public int getClassesNoJ() {
		return classesNoJ;
	}

	public void setClassesNoJ(int classesNoJ) {
		this.classesNoJ = classesNoJ;
	}

	public int getRecBooksNoJ() {
		return recBooksNoJ;
	}

	public void setRecBooksNoJ(int recBooksNoJ) {
		this.recBooksNoJ = recBooksNoJ;
	}

	@Override
	public String toString() {
		return "Student [idJ=" + idJ + ", emailJ=" + emailJ + ", studentNameJ=" + studentNameJ + ", semesterJ="
				+ semesterJ + ", classesNoJ=" + classesNoJ + ", recBooksNoJ=" + recBooksNoJ + "]";
	}
	
	
}
