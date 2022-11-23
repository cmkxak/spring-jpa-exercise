package com.ll.jpaexercise.service;

import com.ll.jpaexercise.entity.Author;
import com.ll.jpaexercise.entity.Book;
import com.ll.jpaexercise.entity.dto.BookResponse;
import com.ll.jpaexercise.repository.AuthorRepository;
import com.ll.jpaexercise.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class BookService {
    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    public List<BookResponse> findBooks(Pageable pageable) {
        List<Book> books = bookRepository.findAll();
        List<BookResponse> bookResponses = books.stream()
                .map(book -> {
                    Optional<Author> optionalAuthor = authorRepository.findById(book.getAuthorId());
                    return BookResponse.of(book, optionalAuthor.get().getName());
                }).collect(Collectors.toList());
        return bookResponses;
    }
}
