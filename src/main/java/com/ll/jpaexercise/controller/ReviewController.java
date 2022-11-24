package com.ll.jpaexercise.controller;

import com.ll.jpaexercise.entity.dto.ReviewResponse;
import com.ll.jpaexercise.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/reviews")
@RequiredArgsConstructor
@RestController
public class ReviewController {

    private final ReviewService reviewService;

    @GetMapping("/{id}")
    public ResponseEntity<ReviewResponse> getOneReview(@PathVariable Long id) {
        ReviewResponse reviewResponse = reviewService.findOneReview(id);
        return ResponseEntity.ok().body(reviewResponse);
    }

}
