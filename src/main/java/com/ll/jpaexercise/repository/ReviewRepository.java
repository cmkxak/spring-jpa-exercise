package com.ll.jpaexercise.repository;

import com.ll.jpaexercise.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findReviewByHospitalId(Long id);
}
