package com.cg.movie.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name="moviedetails")
public class Movies {
	
@Id
@SequenceGenerator(name = "m_seq", sequenceName="movie_seq")
@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="m_seq")
private Integer moviesId;
private String moviesName;
private Integer moviesRating;
private String moviesGenre;
public Integer getMoviesId() {
	return moviesId;
}
public void setMoviesId(Integer moviesId) {
	this.moviesId = moviesId;
}
public String getMoviesName() {
	return moviesName;
}
public void setMoviesName(String moviesName) {
	this.moviesName = moviesName;
}
public Integer getMoviesRating() {
	return moviesRating;
}
public void setMoviesRating(Integer moviesRating) {
	this.moviesRating = moviesRating;
}
public String getMoviesGenre() {
	return moviesGenre;
}
public void setMoviesGenre(String moviesGenre) {
	this.moviesGenre = moviesGenre;
}
@Override
public String toString() {
	return "Movies [moviesId=" + moviesId + ", moviesName=" + moviesName + ", moviesRating=" + moviesRating
			+ ", moviesGenre=" + moviesGenre + "]";
}


}
