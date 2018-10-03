package com.cg.movie.dao;

import java.util.List;

import com.cg.movie.bean.Movies;

public interface MovieDao {

	List<Movies> getAllMovies();

	void addMovie(Movies movie);

	Movies searchMovie(String movieCategory);

}
