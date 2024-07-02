package com.sparta.book.dto;

import lombok.Getter;

@Getter
public class BookRequestDto {

    Long bookID;
    String title;
    String author;
    String language;
    String publisher;
    String resistDate;

}
