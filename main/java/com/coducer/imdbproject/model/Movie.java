package com.coducer.imdbproject.model;

import java.util.List;

public class Movie {
	private String mname;
	private int mid;
	private String mdirector;
	private Review mreview;
	private List<Actor> mactor;
	
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMdirector() {
		return mdirector;
	}
	public void setMdirector(String mdirector) {
		this.mdirector = mdirector;
	}
	public Review getMreview() {
		return mreview;
	}
	public void setMreview(Review mreview) {
		this.mreview = mreview;
	}
	public List<Actor> getMactor() {
		return mactor;
	}
	public void setMactor(List<Actor> mactor) {
		this.mactor = mactor;
	}
	
	
	
}
