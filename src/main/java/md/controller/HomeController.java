package md.controller;

import md.dao.PersonDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Sample controller for going to the home page with a message
 */
@Controller
public class HomeController {

//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public String home(Model model) {
//		model.addAttribute("controllerMessage", "This is the message from the controller!");
//		return "home";
//	}
	@Autowired
	private PersonDao personDao;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("listStudents", "lista de studneti");
		model.addAttribute("studentList", personDao.getPeople());
		return "index";
	}


}
