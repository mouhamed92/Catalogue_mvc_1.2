package org.sid.web;

import java.util.List;

import org.sid.dao.produitRepository;
import org.sid.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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
					      @RequestParam(name="page" ,defaultValue="0")int p,	
						  @RequestParam(name="size" ,defaultValue="5")int s,
			              @RequestParam(name="motCle" ,defaultValue="")String mc){
		
		Page<Produit> produit =   produitrep.chercher("%"+mc+"%",new PageRequest(p, s));
		int[] pages = new int[produit.getTotalPages()];
		model.addAttribute("produits",produit);
		model.addAttribute("pages",pages);
		model.addAttribute("motCle",mc);
		
		return "index";
	}
}
