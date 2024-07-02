package com.sparta.book.dto;

import com.sparta.book.entity.Book;
import lombok.Getter;

@Getter
public class BookResponseDto {

    Long bookID;
    String title;
    String author;
    String language;
    String publisher;
    String resistDate;

    public BookResponseDto(Book book) {
        this.bookID = book.getBookID();
        this.title = book.getTitle();
        this.author = book.getAuthor();
        this.language = book.getLanguage();
        this.publisher = book.getPublisher();
        this.resistDate = book.getResistDate();
    }

    public BookResponseDto(Long bookID, String title, String author, String language, String publisher, String resistDate) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.language = language;
        this.publisher = publisher;
        this.resistDate = resistDate;
    }
}
