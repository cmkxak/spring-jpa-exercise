package com.ll.jpaexercise.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ReviewCreateRequest {
    private Long hospitalId;
    private String title;
    private String contents;
    private String username;
}
