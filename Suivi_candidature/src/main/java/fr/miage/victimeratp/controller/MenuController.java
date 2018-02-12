package fr.miage.victimeratp.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MenuController
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MenuController {

	@RequestMapping("/menu") // prefixe du .do, a besoin de index.do pour voir les attributs
	protected ModelAndView forMenu(HttpServletRequest request,
			HttpServletResponse response){
		
		ModelAndView model = new ModelAndView("menu"); // identifie la vue a retourner à spring-servlet, pas besoin de .XXX car definie dans config
		model.addObject("msg", "testController");
		return model;
	}

}
