package com.cg.movie.dao;

import java.util.List;



import com.cg.movie.bean.Category;
import com.cg.movie.bean.Movies;

public interface MovieDao {

	List<Movies> getAllMovies();

	void addMovie(Movies movie);

	List<Movies> searchMovie(String movieCategory);

	List<Category> getCategoryList();

	List<Movies> deleteMovie(int moviesId,String movieCategory);

}
