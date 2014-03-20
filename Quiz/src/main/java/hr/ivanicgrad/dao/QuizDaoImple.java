package hr.ivanicgrad.dao;

import hr.ivanicgrad.model.Odgovor;
import hr.ivanicgrad.model.Pitanje;
import hr.ivanicgrad.model.Quiz;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class QuizDaoImple implements QuizDao {
	@Autowired
	private SessionFactory sessionFactory;

	public List<Quiz> getAllQuiz() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Quiz")
				.list();
	}

	public List<Pitanje> getAllPtanje(int idQuiz) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession()
				.createQuery("from Pitanje where idQuiz=" + idQuiz).list();
	}

	public List<Odgovor> getAllOdgovor(int idPitanje) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession()
				.createQuery("from Odgovor where idPitanje=" + idPitanje)
				.list();
	}

}
