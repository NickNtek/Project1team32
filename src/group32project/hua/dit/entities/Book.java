package group32project.hua.dit.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name ="title")
	private String titleJ;
	
	@Column(name = "author")
	private String authorJ;
	
	@Column(name = "edition")
	private int editionj;
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="publisher")
//	@Column(name = "publisher")
	private Publisher publisherJ;
	
	@Column(name = "available")
	private int availableJ;
	
	public Book() {
		
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", titleJ=" + titleJ + ", authorJ=" + authorJ + ", editionj=" + editionj
				+ ", publisherJ=" + publisherJ + ", availableJ=" + availableJ + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitleJ() {
		return titleJ;
	}

	public void setTitleJ(String titleJ) {
		this.titleJ = titleJ;
	}

	public String getAuthorJ() {
		return authorJ;
	}

	public void setAuthorJ(String authorJ) {
		this.authorJ = authorJ;
	}

	public int getEditionj() {
		return editionj;
	}

	public void setEditionj(int editionj) {
		this.editionj = editionj;
	}

	public Publisher getPublisherJ() {
		return publisherJ;
	}

	public void setPublisherJ(Publisher publisherJ) {
		this.publisherJ = publisherJ;
	}

	public int getAvailableJ() {
		return availableJ;
	}

	public void setAvailableJ(int availableJ) {
		this.availableJ = availableJ;
	}
	
	
}
