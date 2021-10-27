package com.mayssa.demo;
import java.util.Date;
import java.util.List; 
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mayssa.demo.entites.produit;
import com.mayssa.demo.repos.ProduitRepository;

//import antlr.collections.List;
@SpringBootTest
class ProduitsApplicationTests {
	@Autowired
	private ProduitRepository produitRepository;
	@Test
	public void testCreateProduit() {
	produit prod = new produit("c HP",1200.500,new Date());
	produitRepository.save(prod);
	}
	@Test
	void contextLoads() {
	}
	 @Test
	 public void testFindProduit()
	 {
	 produit p = produitRepository.findById(1L).get(); 
	 System.out.println(p);
	 }
	 @Test
	 public void testUpdateProduit()
	 {
	 produit p = produitRepository.findById(1L).get();
	 p.setPrixProduit(1000.0);
	 produitRepository.save(p);
	 }
	 @Test 
	 public void testDeleteProduit()
	 {
	 produitRepository.deleteById(1L);;
	 }
	  
	 @Test
	 public void testListerTousProduits()
	 {
	 List<produit> prods = produitRepository.findAll();
	 for (produit p : prods)
	 {
	 System.out.println(p);
	 }
	 }

}
