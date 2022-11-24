package com.ll.jpaexercise.service;

import com.ll.jpaexercise.entity.dto.ReviewResponse;
import com.ll.jpaexercise.entity.Hospital;
import com.ll.jpaexercise.entity.Review;
import com.ll.jpaexercise.entity.dto.ReviewCreateRequest;
import com.ll.jpaexercise.entity.dto.ReviewCreateResponse;
import com.ll.jpaexercise.repository.HospitalRepository;
import com.ll.jpaexercise.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ReviewService {
    private final ReviewRepository reviewRepository;
    private final HospitalRepository hospitalRepository;

    public ReviewCreateResponse add(ReviewCreateRequest reviewCreateRequest){
        Optional<Hospital> optHospital = hospitalRepository.findById(reviewCreateRequest.getHospitalId());
        Review review = Review.builder()
                .title(reviewCreateRequest.getTitle())
                .contents(reviewCreateRequest.getContents())
                .username(reviewCreateRequest.getUsername())
                .hospital(optHospital.get())
                .build();
        Review savedReview = reviewRepository.save(review);
        return new ReviewCreateResponse(savedReview.getId(), savedReview.getTitle(), savedReview.getContents(), "리뷰 등록 성공.");
    }

    public ReviewResponse findOneReview(Long id) {
        Review review = reviewRepository.findById(id)
                .orElseThrow(RuntimeException::new);
        return new ReviewResponse(review.getId(), review.getTitle(), review.getContents());
    }
}
