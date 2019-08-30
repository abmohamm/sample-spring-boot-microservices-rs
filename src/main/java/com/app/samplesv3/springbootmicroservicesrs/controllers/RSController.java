package com.app.samplesv3.springbootmicroservicesrs.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.samplesv3.springbootmicroservicesrs.model.Rating;
import com.app.samplesv3.springbootmicroservicesrs.model.UserRating;

// TODO: Auto-generated Javadoc
/**
 * The Class RSController.
 */
@RestController
@RequestMapping("/ratingsdata")
public class RSController {

    /**
     * Gets the movie rating.
     *
     * @param movieId the movie id
     * @return the movie rating
     */
    @RequestMapping("/movies/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId) {
        return new Rating(movieId, 4);
    }
    
    @RequestMapping("/users/{userId}")
    public UserRating getUserRating(@PathVariable("userId") String userId) {
    	UserRating rating = new UserRating();
        List<Rating> ratings = Arrays.asList(new Rating("1234",4),
        									 new Rating("5678",3));
        rating.setRatings(ratings);        
        return rating;
    }

//    @RequestMapping("/user/{userId}")
//    public UserRating getUserRatings(@PathVariable("userId") String userId) {
//        UserRating userRating = new UserRating();
//        userRating.initData(userId);
//        return userRating;
//
//    }

}
