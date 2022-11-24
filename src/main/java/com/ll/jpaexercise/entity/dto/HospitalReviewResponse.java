package com.ll.jpaexercise.entity.dto;

import com.ll.jpaexercise.entity.Hospital;
import com.ll.jpaexercise.entity.Review;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class HospitalReviewResponse {
    private String name;
    private String roadAddress;
    private String title;
    private String contents;
    private String username;

    public static List<HospitalReviewResponse> of(Hospital hospital){
        List<HospitalReviewResponse> hReviewResponse = new ArrayList<>();

        List<Review> reviews = hospital.getReviews();

        for (Review review : reviews) {
            hReviewResponse.add(HospitalReviewResponse.builder()
                    .name(hospital.getName())
                    .roadAddress(hospital.getRoadAddress())
                    .title(review.getTitle())
                    .contents(review.getContents())
                    .username(review.getUsername())
                    .build());
        }
        return hReviewResponse;
    }
}
