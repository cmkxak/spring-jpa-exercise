package com.ll.jpaexercise.entity.dto;

import com.ll.jpaexercise.entity.Hospital;
import com.ll.jpaexercise.entity.Review;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

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

    public static HospitalReviewResponse of(Hospital hospital, Review review){
        return new HospitalReviewResponse().builder()
                .name(hospital.getName())
                .roadAddress(hospital.getRoadAddress())
                .title(review.getTitle())
                .contents(review.getContents())
                .username(review.getUsername())
                .build();
    }
}
