package com.coducer.imdbproject.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.coducer.imdbproject.model.Movie;
import com.coducer.imdbproject.repo.MovieRepo;
import com.coducer.imdbproject.validate.Validator;

@Path("movies")
public class MovieController {
	
	MovieRepo movieRepo = new MovieRepo();
	Validator validator = new Validator();
	
	@GET
	@Path("movie/{id}")
	public Movie getMovie(@PathParam("id") int id, @HeaderParam("authorization") String auth) {
		
		//connector.connect();
		
		if(validator.checkLogin(auth))
			return movieRepo.getMovie(id);
		return null;
	}
	
	@GET
	@Path("all")
	public List<Movie> getMovies(@HeaderParam("authorization") String auth){
		if(validator.checkLogin(auth))
			return movieRepo.getMovies();
		
		return null;
	}
	
	@POST
	@Path("movie")
	public Movie createMovie(Movie m1, @HeaderParam("authorization") String auth) {
		if(validator.checkLogin(auth))
			movieRepo.create(m1);
		
		return m1;
	}
}
