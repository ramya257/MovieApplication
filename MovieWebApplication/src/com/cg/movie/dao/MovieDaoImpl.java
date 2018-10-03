package com.cg.movie.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.movie.bean.Movies;


@Repository
public class MovieDaoImpl implements MovieDao{
	
	
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public List<Movies> getAllMovies() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addMovie(Movies movie) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Movies searchMovie(String movieCategory) {
		// TODO Auto-generated method stub
		return null;
	}

}
