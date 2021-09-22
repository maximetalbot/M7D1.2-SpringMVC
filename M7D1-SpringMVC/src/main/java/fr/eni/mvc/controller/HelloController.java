package fr.eni.mvc.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

// Bean simple
@Controller
public class HelloController {

	// Méthode simple, publique. 
	// L'annotaion va pouvoir être mappée avec une requète utilisateur via le path
	// on va donc suivre ce path vers le repertoir WEB-INF pour trouver hello.jsp
	@RequestMapping(method=RequestMethod.GET, path="/hello")
	public ModelAndView bonjour() {
		// Dans le composant MaV on traite à la foi le retour et le passage d'attribut clé/val
		// ModelAndView(retour, clé, valeur)
		ModelAndView mav = new ModelAndView(
				"hello",
				"msg",
				"Message from HelloController usgin ModelAndView !"
				);
		return mav;
	}
	
	@RequestMapping(method=RequestMethod.GET, path="/bonjour")
	public ModelAndView bonjourNom(String nom) {
		ModelAndView mav = new ModelAndView(
				"hello",
				"msg",
				"Bonjour "+nom+" !"
				);
		return mav;
	}
	
	@RequestMapping(method=RequestMethod.POST, path="/ajout")
	public ModelAndView ajout(String prenom, String nom) {
		ModelAndView mav = new ModelAndView(
				"hello",
				"msg",
				"La personne ("+prenom+" "+nom+") a bien été ajoutée !"
				);
		return mav;
	}

}
