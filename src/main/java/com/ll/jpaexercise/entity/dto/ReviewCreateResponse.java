package com.ll.jpaexercise.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ReviewCreateResponse {
    private Long id;
    private String title;
    private String contents;
    private String message;
}
