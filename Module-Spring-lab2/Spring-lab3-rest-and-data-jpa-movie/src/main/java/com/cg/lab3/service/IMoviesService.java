package com.cg.lab3.service;

import java.util.List;

import com.cg.lab3.Exception.MoviesException;
import com.cg.lab3.entity.Category;
import com.cg.lab3.entity.Movies;

public interface IMoviesService {

	Movies add(Movies movies) throws MoviesException;
	Movies save(Movies movies) throws MoviesException;
	void deleteById(String movieName);
	
	Movies findById(String MovieName);
	List<Movies> findByCategory(Category category);
	
	List<Movies> findAll();
	
}
