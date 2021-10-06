package com.mayssa.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mayssa.demo.entites.produit;
 
public interface ProduitRepository extends JpaRepository<produit, Long> {

}
