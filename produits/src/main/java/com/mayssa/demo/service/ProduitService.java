package com.mayssa.demo.service;
import java.util.List;
import com.mayssa.demo.entites.produit;

public interface ProduitService {
	produit saveProduit(produit p);
	produit updateProduit(produit p);
	void deleteProduit(produit p);
	 void deleteProduitById(Long id);
	 produit getProduit(Long id);
	List<produit> getAllProduits();

}
