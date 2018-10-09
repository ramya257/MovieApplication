package com.cg.movie.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.movie.bean.Category;
import com.cg.movie.bean.Movies;
import com.cg.movie.service.MovieService;


@RestController
public class MovieController {
	
	
	@Autowired
	MovieService movieService;
	
	@RequestMapping(value ="/movie/createMovie/",consumes = MediaType.APPLICATION_JSON_VALUE,headers="Accept=application/json",method = RequestMethod.POST)
	public List<Movies> createMovie(@RequestBody  Movies movie) {
		
		System.out.println("adding movie");
		System.out.println(movie);
		movieService.addMovie(movie);
		return movieService.getAllMovies();
}
	@RequestMapping(value ="/movie/searchMovie/{movieCategory}",headers="Accept=application/json",method = RequestMethod.GET,produces = "application/json")
	public List<Movies> searchMovie(@PathVariable("movieCategory") String movieCategory) {
		System.out.println("In search");
		return movieService.searchMovie(movieCategory);
}
	
	@RequestMapping(value="/movie/fetchCategory",headers="Accept=application/json",method = RequestMethod.GET, produces = "application/json")
	public List<Category> getCategoryList(){
		return movieService.getCategoryList();
	}
	
	@RequestMapping(value="/movie/deleteMovie/{movieId}/{movieCategory}",headers="Accept=application/json",method = RequestMethod.DELETE, produces = "application/json")
	public List<Movies> deleteMovie(@PathVariable("movieId") int movieId,@PathVariable("movieCategory") String movieCategory){
		return movieService.deleteMovie(movieId,movieCategory);
		
	}
	
	@RequestMapping(value="/movie/updateMovie",consumes = MediaType.APPLICATION_JSON_VALUE,headers="Accept=application/json",method = RequestMethod.PUT,produces="application/json")
	public List<Movies> updateMovie(@RequestBody Movies movie){
		System.out.println(movie);
		movieService.updateMovie(movie);
		return movieService.getAllMovies();
	}
	
	@RequestMapping(value="/movie/getAllMovies/",produces="application/json",method=RequestMethod.GET,headers="Accept=application/json")
	public List<Movies> getAllMovies(){
		return movieService.getAllMovies();
	}
	
	
	
	

}
