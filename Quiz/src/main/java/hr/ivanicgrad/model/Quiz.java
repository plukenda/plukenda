package hr.ivanicgrad.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Quiz")
public class Quiz {
	@Id
	@Column(name = "id")
	@GeneratedValue
	private int id;
	@Column(name = "quizName")
	private String imeQuiz;

	public Quiz() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImeQuiz() {
		return imeQuiz;
	}

	public void setImeQuiz(String imeQuiz) {
		this.imeQuiz = imeQuiz;
	}

	public Quiz(int id, String imeQuiz) {
		this.id = id;
		this.imeQuiz = imeQuiz;
	}

}
