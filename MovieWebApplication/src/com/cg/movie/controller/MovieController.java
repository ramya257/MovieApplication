package com.cg.movie.controller;

import java.util.List;
import java.util.Locale.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.movie.bean.Movies;
import com.cg.movie.service.MovieService;



@RestController
public class MovieController {
	
	
	@Autowired
	MovieService movieService;
	
	@RequestMapping(value ="/movie/create/",consumes = MediaType.APPLICATION_JSON_VALUE,headers="Accept=application/json",method = RequestMethod.POST)
	public List<Movies> createMovie(@RequestBody  Movies movie) {
		
		System.out.println("hiiii");
		System.out.println(movie);
		movieService.addMovie(movie);
		return movieService.getAllMovies();
}
	@RequestMapping(value ="/movie/search/{movieCategory}",headers="Accept=application/json",method = RequestMethod.GET)
	public List<Movies> searchMovie(@PathVariable("movieCategory") String movieCategory) {
		System.out.println("In search");
		return movieService.searchMovie(movieCategory);
}
	
	@RequestMapping(value="/movie/fetchCategory",headers="Accept=application/json",method = RequestMethod.GET)
	public List<Category> getCategoryList(){
		return movieService.getCategoryList();
	}
	

}
