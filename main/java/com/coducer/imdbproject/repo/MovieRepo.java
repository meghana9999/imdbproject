package com.coducer.imdbproject.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.coducer.imdbproject.model.Actor;
import com.coducer.imdbproject.model.Movie;
import com.coducer.imdbproject.model.Review;

public class MovieRepo {
	
	List<Movie> movies;
	
	public MovieRepo() {
		movies = new ArrayList<>();
		Actor a1 = new Actor();
		a1.setAge(20);
		a1.setAid(101);
		a1.setName("Anushka");
		
		Actor a2 = new Actor();
		a1.setAge(30);
		a1.setAid(102);
		a1.setName("Prabhas");
		
		List<Actor> actor = new ArrayList<>();
		actor.add(a1);
		actor.add(a2);
		
		Review r1 = new Review();
		r1.setRid(301);
		r1.setRating(5);
		
		Movie m1 = new Movie();
		m1.setMid(201);
		m1.setMdirector("rajamouli");
		m1.setMname("bahubali");
		m1.setMactor(actor);
		m1.setMreview(r1);
		
		movies.add(m1);
		
	}

	public Movie getMovie(int id) {
		for(Movie m : movies) {
			if(m.getMid() == id)
				return m;
		}
		return null;
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public void create(Movie m1) {
		movies.add(m1);
	}

}
