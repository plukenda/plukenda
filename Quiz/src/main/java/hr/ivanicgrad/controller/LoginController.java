package hr.ivanicgrad.controller;

import hr.ivanicgrad.model.Odgovor;
import hr.ivanicgrad.model.Pitanje;
import hr.ivanicgrad.model.Quiz;
import hr.ivanicgrad.service.QuizService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class LoginController {
	@Autowired
	private QuizService quizService;
	private int i = 0;
	private List<Odgovor> listaOdgovora;
	private List<Pitanje> listaPitanja;

	@RequestMapping(method = RequestMethod.GET)
	public String doGet(Map<String, Object> map) {
		map.put("quiz", new Quiz());
		map.put("quizList", quizService.getAllQuiz());
		return "login";
	}

	@RequestMapping(value = "/pitanje/{id}", method = RequestMethod.GET)
	public String getQuiz(@PathVariable("id") Integer id, Model model) {
		listaPitanja = quizService.getAllPtanje(id);
		Pitanje pitanje = listaPitanja.get(i);
		listaOdgovora = quizService.getAllOdgovor(pitanje.getId());
		model.addAttribute("pitanje", pitanje.getPitanje());
		model.addAttribute("listaOdgovora", listaOdgovora);
		i++;
		return "quiz";

	}

	@RequestMapping(value = "/sljedece", method = RequestMethod.GET)
	public String sljedece(Model model) {
		Pitanje pitanje = listaPitanja.get(i);
		listaOdgovora = quizService.getAllOdgovor(pitanje.getId());
		model.addAttribute("pitanje", pitanje.getPitanje());
		model.addAttribute("listaOdgovora", listaOdgovora);
		i++;
		return "quiz";

	}
}
