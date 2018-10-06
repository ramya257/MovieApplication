package com.cg.movie.dao;

import java.util.List;



import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.movie.bean.Category;
import com.cg.movie.bean.Movies;


@Repository
public class MovieDaoImpl implements MovieDao{
	
	
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public List<Movies> getAllMovies() {
		// TODO Auto-generated method stub
		String query="select movie from Movies movie";
		TypedQuery<Movies> movieList=entityManager.createQuery(query, Movies.class);
		
		return movieList.getResultList();
	}

	@Override
	public void addMovie(Movies movie) {
		// TODO Auto-generated method stub
		entityManager.persist(movie);
		
	}

	@Override
	public List<Movies> searchMovie(String movieCategory) {
		// TODO Auto-generated method stub
		String query="select movie from Movies movie where moviesGenre=:pMovieCat";
		TypedQuery<Movies> searchQuery=entityManager.createQuery(query,Movies.class);
		searchQuery.setParameter("pMovieCat", movieCategory);
		return searchQuery.getResultList();
	}

	@Override
	public List<Category> getCategoryList() {
		// TODO Auto-generated method stub
		String query="select category from Category category";
		TypedQuery<Category> categoryQuery=entityManager.createQuery(query,Category.class);
		return categoryQuery.getResultList();
	}

}
