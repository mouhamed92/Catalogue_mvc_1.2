package org.sid.dao;

import org.springframework.data.repository.query.Param;

import java.util.List;

import org.sid.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface produitRepository extends JpaRepository<Produit, Long> {
	@Query("select p from Produit p where designation like:x")
	public List<Produit>chercher(@Param("x")String mc);

}
