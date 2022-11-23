package com.ll.jpaexercise.entity.dto;

import com.ll.jpaexercise.entity.Book;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@AllArgsConstructor
public class BookResponse {
    private Long id;
    private String name;
    private String authorName;


    public static BookResponse of(Book book, String authorName) {
        return BookResponse.builder()
                .id(book.getId())
                .name(book.getTitle())
                .authorName(authorName)
                .build();
    }
}
