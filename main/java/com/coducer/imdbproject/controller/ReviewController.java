package com.coducer.imdbproject.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.coducer.imdbproject.model.Review;
import com.coducer.imdbproject.repo.ReviewRepo;
import com.coducer.imdbproject.validate.Validator;

@Path("reviews")
public class ReviewController {
	
	ReviewRepo reviewRepo = new ReviewRepo();
	Validator validator = new Validator();
	
	@GET
	@Path("review/{id}")
	public Review getReview(@PathParam("id") int id, @HeaderParam("authorization") String auth) {
		if(validator.checkLogin(auth))
			return reviewRepo.getReview(id);
		
		return null;
	}
	
	@GET
	@Path("all")
	public List<Review> getReviews(@HeaderParam("authorization") String auth){
		if(validator.checkLogin(auth))
			return reviewRepo.getReviews();
		return null;
	}
	
	@POST
	@Path("alien")
	public Review createReview(Review r1, @HeaderParam("authorization") String auth) {
		if(validator.checkLogin(auth))
			reviewRepo.create(r1);
		return r1;
	}
}
