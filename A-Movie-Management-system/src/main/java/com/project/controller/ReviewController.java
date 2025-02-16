package com.project.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.Review;
import com.project.service.IReviewService;

@RestController
@RequestMapping("api/reviews")
public class ReviewController {

    @Autowired
    private IReviewService reviewService;

    @PostMapping("/{movieId}")
    public Review createReview(@PathVariable int movieId, @RequestBody Review review) {
        return reviewService.saveReview(movieId, review);
    }
}
