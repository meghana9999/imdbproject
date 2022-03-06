package com.coducer.imdbproject.repo;

import java.util.ArrayList;
import java.util.List;
import com.coducer.imdbproject.model.Review;

public class ReviewRepo {
	List<Review> reviews;
	
	public ReviewRepo() {
		reviews = new ArrayList<>();
		
		Review r1 = new Review();
		r1.setRid(301);
		r1.setRating(5);
		
		reviews.add(r1);
	}

	public void create(Review m1) {
		reviews.add(m1);
	}

	public Review getReview(int id) {
		for(Review r : reviews) {
			if(r.getRid() == id)
				return r;
		}
		return null;
	}

	public List<Review> getReviews() {
		return reviews;
	}

}
