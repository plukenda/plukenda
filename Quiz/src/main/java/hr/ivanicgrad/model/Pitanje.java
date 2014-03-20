package hr.ivanicgrad.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pitanje")
public class Pitanje {
	@Id
	@Column(name = "id")
	@GeneratedValue
	private int id;

	@Column(name = "pitanje")
	private String pitanje;

	public Pitanje() {

	}

	public Pitanje(int id, String pitanje) {
		this.id = id;
		this.pitanje = pitanje;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPitanje() {
		return pitanje;
	}

	public void setPitanje(String pitanje) {
		this.pitanje = pitanje;
	}

}
