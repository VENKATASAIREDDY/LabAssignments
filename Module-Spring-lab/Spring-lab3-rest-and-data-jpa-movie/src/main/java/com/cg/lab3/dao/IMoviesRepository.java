package com.cg.lab3.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.lab3.entity.Category;
import com.cg.lab3.entity.Movies;

public interface IMoviesRepository extends JpaRepository<Movies, String> {

	boolean existsByCategory(Category category);
	
	List<Movies> findByCategory(Category category);
}
