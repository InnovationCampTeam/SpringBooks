package com.sparta.book.service;

import com.sparta.book.dto.BookRequestDto;
import com.sparta.book.dto.BookResponseDto;
import com.sparta.book.entity.Book;
import com.sparta.book.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public BookResponseDto createMemo(BookRequestDto requestDto) {
        Book book = new Book(requestDto);

        // DB 저장
        Book saveBook = bookRepository.save(book);

        // Entity -> ResponseDto
        BookResponseDto bookResponseDto = new BookResponseDto(book);

        return bookResponseDto;

    }



}
