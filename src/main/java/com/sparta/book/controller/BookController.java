package com.sparta.book.controller;


import com.sparta.book.dto.BookRequestDto;
import com.sparta.book.dto.BookResponseDto;
import com.sparta.book.service.BookService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/books")
    public BookResponseDto createMemo(@RequestBody BookRequestDto requestDto) {
        // RequestDto -> Entity
        return bookService.createMemo(requestDto);

    }

}
