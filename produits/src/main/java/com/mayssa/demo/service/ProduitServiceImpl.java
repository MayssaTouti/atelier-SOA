package com.mayssa.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mayssa.demo.entites.produit; 
import com.mayssa.demo.repos.ProduitRepository;

@Service
public class ProduitServiceImpl implements ProduitService  {

	
	
	@Autowired
	ProduitRepository produitRepository;

	@Override
	public produit saveProduit(produit p) {
		return produitRepository.save(p);
		// TODO Auto-generated method stub
	
	}

	@Override
	public produit updateProduit(produit p) {
		return produitRepository.save(p);

		// TODO Auto-generated method stub
	
	}

	@Override
	public void deleteProduit(produit p) {
		produitRepository.delete(p);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProduitById(Long id) {
		produitRepository.deleteById(id);

		// TODO Auto-generated method stub
		
	}

	@Override
	public produit getProduit(Long id) {
		return produitRepository.findById(id).get();

		// TODO Auto-generated method stub
		
	}

	@Override
	public List<produit> getAllProduits() {
		return produitRepository.findAll();
		// TODO Auto-generated method stub
		
	}
	

	
	
}
