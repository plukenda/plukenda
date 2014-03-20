package hr.ivanicgrad.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "odgovor")
public class Odgovor {
	@Id
	@Column(name = "id")
	@GeneratedValue
	private int id;
	@Column(name = "odgovor")
	private String odogvor;
	@Column(name = "tocno")
	private boolean ispravnost;
	@Column(name = "idPitanje")
	private int idPitanje;

	public Odgovor() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOdogvor() {
		return odogvor;
	}

	public void setOdogvor(String odogvor) {
		this.odogvor = odogvor;
	}

	public boolean isIspravnost() {
		return ispravnost;
	}

	public void setIspravnost(boolean ispravnost) {
		this.ispravnost = ispravnost;
	}

	public int getIdPitanje() {
		return idPitanje;
	}

	public void setIdPitanje(int idPitanje) {
		this.idPitanje = idPitanje;
	}

	public Odgovor(int id, String odogvor, boolean ispravnost, int idPitanje) {
		this.id = id;
		this.odogvor = odogvor;
		this.ispravnost = ispravnost;
		this.idPitanje = idPitanje;
	}

}
