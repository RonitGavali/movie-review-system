package com.project.service;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entity.Movie;
import com.project.repository.MovieRepository;


@Service
public class MovieService implements IMovieService{
    
    @Autowired
    private MovieRepository movieRepository;

    @Override
    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Movie getMovieById(int id) {
        return movieRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteMovie(int id) {
        movieRepository.deleteById(id);
    }

	
}
	
