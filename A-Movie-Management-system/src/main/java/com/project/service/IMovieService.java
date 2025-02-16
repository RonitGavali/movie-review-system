package com.project.service;

import java.util.List;

import com.project.entity.Movie;


public interface IMovieService {
	
	
	 Movie saveMovie(Movie movie);
	    List<Movie> getAllMovies();
	    Movie getMovieById(int id);
	    void deleteMovie(int id);
	 
	

}
