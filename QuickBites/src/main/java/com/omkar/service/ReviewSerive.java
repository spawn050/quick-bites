package com.omkar.service;

import java.util.List;

import com.omkar.Exception.ReviewException;
import com.omkar.model.Review;
import com.omkar.model.User;
import com.omkar.request.ReviewRequest;

public interface ReviewSerive {
	
    public Review submitReview(ReviewRequest review,User user);
    public void deleteReview(Long reviewId) throws ReviewException;
    public double calculateAverageRating(List<Review> reviews);
}
