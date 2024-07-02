package com.sparta.book.entity;


import com.sparta.book.dto.BookRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Book {

    Long bookID;
    String title;
    String author;
    String language;
    String publisher;
    String resistDate;


    public Book(BookRequestDto requestDto) {
        this.title = requestDto.getTitle();
        this.author = requestDto.getAuthor();
        this.language = requestDto.getLanguage();
        this.publisher = requestDto.getPublisher();
        this.resistDate = requestDto.getResistDate();

    }

}