package com.ll.jpaexercise.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ReviewResponse {
    private Long id;
    private String title;
    private String contents;
}
