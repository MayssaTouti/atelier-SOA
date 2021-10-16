package com.example.article.service;

import com.example.article.entities.Article;
import com.example.article.entities.Categorie;

import java.util.List;

import org.springframework.data.jpa.repository.Query;


public interface ArticleService {
	Article saveArticle(Article p);
	Article updateArticle(Article p);
	void deleteArticle(Article p);
	 void deleteArticleById(Long id);
	 Article getArticle(Long id);
	List<Article> getAllArticle();
	
	
	
	List<Article> findByTitre(String titre);
	List<Article> testFindArticleByTitreLike(String titre);
	


}
