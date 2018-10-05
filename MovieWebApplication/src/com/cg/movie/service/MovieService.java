package com.cg.movie.service;

import java.util.List;
import java.util.Locale.Category;

import com.cg.movie.bean.Movies;

public interface MovieService {

	List<Movies> getAllMovies();

	void addMovie(Movies movie);

	List<Movies> searchMovie(String movieCategory);

	List<Category> getCategoryList();

}
