package com.coducer.imdbproject.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.coducer.imdbproject.model.Actor;
import com.coducer.imdbproject.repo.ActorRepo;
import com.coducer.imdbproject.validate.Validator;

@Path("actors")
public class ActorController {
	
	ActorRepo actorRepo =new ActorRepo();
	Validator validator = new Validator();
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("actor/{id}")
	public Actor getActor( @PathParam("id") int id, @HeaderParam("authorization") String auth)  {
		
		if(validator.checkLogin(auth))
			return actorRepo.getActor(id);
		
		return	null;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("all")
	public List<Actor> getActors(@HeaderParam("authorization") String auth) {
		if(validator.checkLogin(auth))
		  return actorRepo.getActors();
		
		return null;
	}
	
//	@POST
//	@Path("actor")
//	@Produces(MediaType.APPLICATION_JSON)
//	@Consumes(MediaType.APPLICATION_JSON)
//	public Actor createActor(Actor a1,  @HeaderParam("authorization") String auth) {
//		if(validator.checkLogin(auth))
//			actorRepo.create(a1);
//		
//		return a1;
//	}
}
