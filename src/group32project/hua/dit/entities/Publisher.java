package group32project.hua.dit.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="publisher")
public class Publisher {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int idJ;
	
	@Column(name = "name")
	private String nameJ;
	
	@Column(name = "location")
	private String locationJ;
	
	@Column(name="instructions")
	private String instructionsJ;

	public int getIdJ() {
		return idJ;
	}

	public void setIdJ(int idJ) {
		this.idJ = idJ;
	}

	public String getNameJ() {
		return nameJ;
	}

	public void setNameJ(String nameJ) {
		this.nameJ = nameJ;
	}

	public String getLocationJ() {
		return locationJ;
	}

	public void setLocationJ(String locationJ) {
		this.locationJ = locationJ;
	}

	public String getInstructionsJ() {
		return instructionsJ;
	}

	public void setInstructionsJ(String instructionsJ) {
		this.instructionsJ = instructionsJ;
	}

	public Publisher() {
		
	}

	public Publisher(String nameJ, String locationJ, String instructionsJ) {
		this.nameJ = nameJ;
		this.locationJ = locationJ;
		this.instructionsJ = instructionsJ;
	}

	@Override
	public String toString() {
		return "Publisher [idJ=" + idJ + ", nameJ=" + nameJ + ", locationJ=" + locationJ + ", instructionsJ="
				+ instructionsJ + "]";
	}
	
	
}
