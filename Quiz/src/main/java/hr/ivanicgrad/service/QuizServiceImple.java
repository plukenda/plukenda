package hr.ivanicgrad.service;

import hr.ivanicgrad.dao.QuizDao;
import hr.ivanicgrad.model.Odgovor;
import hr.ivanicgrad.model.Pitanje;
import hr.ivanicgrad.model.Quiz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class QuizServiceImple implements QuizService {
	@Autowired
	private QuizDao quizDAO;

	@Transactional
	public List<Quiz> getAllQuiz() {
		// TODO Auto-generated method stub
		return quizDAO.getAllQuiz();
	}

	@Transactional
	public List<Pitanje> getAllPtanje(int idQuiz) {
		// TODO Auto-generated method stub
		return quizDAO.getAllPtanje(idQuiz);
	}

	@Transactional
	public List<Odgovor> getAllOdgovor(int idPitanje) {
		// TODO Auto-generated method stub
		return quizDAO.getAllOdgovor(idPitanje);
	}

}
