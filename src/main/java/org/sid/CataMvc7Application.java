package org.sid;

import org.sid.dao.produitRepository;
import org.sid.entities.Produit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CataMvc7Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(CataMvc7Application.class, args);
		
		/*produitRepository produitrep = ctx.getBean(produitRepository.class);
		
		produitrep.save(new Produit("hp",241,12));
		produitrep.save(new Produit("epson 148",147,9));
		produitrep.save(new Produit("canon 50D",3,340));*/
	}

}
