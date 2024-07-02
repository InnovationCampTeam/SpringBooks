package com.sparta.book.repository;

import com.sparta.book.entity.Book;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.Statement;
@Repository
public class BookRepository {

    private final JdbcTemplate jdbcTemplate;


    public BookRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public Book save(Book book) {
        // DB 저장
        KeyHolder keyHolder = new GeneratedKeyHolder(); // 기본 키를 반환받기 위한 객체

        String sql = "INSERT INTO book (title, author, language, publisher, resistDate) VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update( con -> {
                    PreparedStatement preparedStatement = con.prepareStatement(sql,
                            Statement.RETURN_GENERATED_KEYS);

                    preparedStatement.setString(1, book.getTitle());
                    preparedStatement.setString(2, book.getAuthor());
                    preparedStatement.setString(3, book.getLanguage());
                    preparedStatement.setString(4, book.getPublisher());
                    preparedStatement.setString(5, book.getResistDate());
                    return preparedStatement;
                },
                keyHolder);

        // DB Insert 후 받아온 기본키 확인
        Long id = keyHolder.getKey().longValue();
        book.setBookID(id);

        return book;
    }




}
