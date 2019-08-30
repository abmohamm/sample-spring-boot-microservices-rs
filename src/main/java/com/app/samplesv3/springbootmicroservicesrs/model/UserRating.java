package com.app.samplesv3.springbootmicroservicesrs.model;

import java.util.List;
import java.util.logging.Logger;

public class UserRating {

	private List<Rating> ratings;
	
	Logger logger = Logger.getLogger(UserRating.class.getName());
	
	public UserRating() {
		super();
		logger.info("UserRating object is created...");
	}
	
	public UserRating(List<Rating> ratings) {
		super();
		this.ratings = ratings;
	}

	public List<Rating> getRatings() {
		return ratings;
	}

	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}
	
	
}
