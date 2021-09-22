package fr.eni.mvc.controller;

import java.text.SimpleDateFormat;
import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path="/heure")
public class HeureController {

	@RequestMapping(method=RequestMethod.GET)
	// Spring nous permet d'utiliser des ModelMap
	// dans ces map on peut y mettre des infos cl�/val
	public String bonjour(ModelMap map) {
		// On y d�finit une Str format� � la date courante
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String chaine = sdf.format(new Date());
		// On passe l'attribut � notre map
		map.addAttribute("heureFormate", chaine);
		
		// On cr�er une liste de Str
		List<String> listeS = new ArrayList<>();
		listeS.add("A");
		listeS.add("B");
		listeS.add("C");
		// Passage de l'attribut au map
		map.addAttribute("liste", listeS);
		
		// on renvoie la Str qui pourra �tre mapp�e derri�re dans la jsp
		return "dateHeure";
	}
}
