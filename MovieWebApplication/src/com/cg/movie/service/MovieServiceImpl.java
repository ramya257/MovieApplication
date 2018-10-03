package com.cg.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.movie.bean.Movies;
import com.cg.movie.dao.MovieDao;


@Service
public class MovieServiceImpl implements MovieService {
	
	@Autowired
	MovieDao movieDao;

	@Override
	public List<Movies> getAllMovies() {
		// TODO Auto-generated method stub
		return movieDao.getAllMovies();
	}

	@Override
	public void addMovie(Movies movie) {
		// TODO Auto-generated method stub
		
		movieDao.addMovie(movie);
		
	}

	@Override
	public Movies searchMovie(String movieCategory) {
		// TODO Auto-generated method stub
		return movieDao.searchMovie(movieCategory);
	}

}
