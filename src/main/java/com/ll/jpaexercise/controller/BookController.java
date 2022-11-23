package com.ll.jpaexercise.controller;

import com.ll.jpaexercise.entity.Book;
import com.ll.jpaexercise.entity.dto.BookResponse;
import com.ll.jpaexercise.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("api/v1/books")
@RequiredArgsConstructor
@RestController
public class BookController {
    private final BookService bookService;

    @GetMapping("")
    public ResponseEntity<List<BookResponse>> getBooks(Pageable pageable){
        List<BookResponse> books = bookService.findBooks(pageable);
        return ResponseEntity.ok().body(books);
    }
}
