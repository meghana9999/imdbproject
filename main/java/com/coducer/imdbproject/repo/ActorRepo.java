package com.coducer.imdbproject.repo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.coducer.imdbproject.model.Actor;

public class ActorRepo {
	List<Actor> actors;
	
	public ActorRepo() {
		
		actors=new ArrayList<Actor>();
		
		Actor a1 = new Actor();
		a1.setAge(20);
		a1.setAid(101);
		a1.setName("Anushka");
		a1.setActedMovie("Bahubali");
		
		Actor a2 = new Actor();
		a2.setAge(10);
		a2.setAid(102);
		a2.setName("Prabhas");
		a2.setActedMovie("Bahubali");
		
		actors.add(a1);
		actors.add(a2);
	}
	
	public List<Actor> getActors(){
		return actors;
	}
	
	public Actor getActor(int id){
		for(Actor a : actors) {
			if(a.getAid() == id)
				return a;
		}
			
		return null;
	}

	public void create(Actor a1) {
		actors.add(a1);
	}
}
