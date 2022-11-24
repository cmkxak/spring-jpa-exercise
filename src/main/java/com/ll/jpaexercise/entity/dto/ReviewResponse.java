package com.ll.jpaexercise.entity.dto;

import com.ll.jpaexercise.entity.Review;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ReviewResponse {
    private Long id;
    private String title;
    private String contents;
    private String username;

    public static ReviewResponse of (Review review){
        ReviewResponse reviewResponse = ReviewResponse.builder()
                .id(review.getId())
                .title(review.getTitle())
                .contents(review.getContents())
                .username(review.getUsername())
                .build();
        return reviewResponse;
    }
}
