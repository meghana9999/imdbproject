package com.coducer.imdbproject.model;

public class Actor {
	private int aid;
	private String name;
	private int age;
	private String  actedMovie;
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getActedMovie() {
		return actedMovie;
	}
	public void setActedMovie(String actedMovie) {
		this.actedMovie = actedMovie;
	}

}
