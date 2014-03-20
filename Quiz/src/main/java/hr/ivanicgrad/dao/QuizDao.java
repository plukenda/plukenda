package hr.ivanicgrad.dao;

import hr.ivanicgrad.model.Odgovor;
import hr.ivanicgrad.model.Pitanje;
import hr.ivanicgrad.model.Quiz;

import java.util.List;

public interface QuizDao {

	public List<Quiz> getAllQuiz();

	public List<Pitanje> getAllPtanje(int idQuiz);

	public List<Odgovor> getAllOdgovor(int idPitanje);
}
