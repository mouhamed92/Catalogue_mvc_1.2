package org.sid.web;

import java.util.List;

import org.sid.dao.produitRepository;
import org.sid.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProduitControlleur {

	@Autowired
	private produitRepository produitrep ;
	
	@RequestMapping(value="/index")
	private String index(Model model,
			              @RequestParam(name="motCle" ,defaultValue="")String mc){
		
		List<Produit> produit =   produitrep.chercher("%"+mc+"%");
		model.addAttribute("produits",produit);
		model.addAttribute("motCle",mc);
		
		return "index";
	}
}
