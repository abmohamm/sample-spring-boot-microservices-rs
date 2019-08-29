package com.app.samplesv3.springbootmicroservicesrs.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.samplesv3.springbootmicroservicesrs.model.Rating;

@RestController
@RequestMapping("/ratingsdata")
public class RSController {

    @RequestMapping("/movies/{movieId}")
    public Rating getMovieRating(@PathVariable("movieId") String movieId) {
        return new Rating(movieId, 4);
    }

//    @RequestMapping("/user/{userId}")
//    public UserRating getUserRatings(@PathVariable("userId") String userId) {
//        UserRating userRating = new UserRating();
//        userRating.initData(userId);
//        return userRating;
//
//    }

}