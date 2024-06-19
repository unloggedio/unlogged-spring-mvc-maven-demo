package org.unlogged.mvc.demo.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.unlogged.mvc.demo.mapper.BookMapper;
import org.unlogged.mvc.demo.model.Book;

import java.util.List;

@RestController
@RequestMapping("/rest/mybatis")
public class MyBatisOpsController {

    @Autowired
    private BookMapper bookMapper;

    public Book getArticleById(long id) {
        return bookMapper.getArticle(id);
    }

    public List<Book> getAllArticles() {
        return bookMapper.getAll();
    }

    public int insertBook(Book book) {
        return bookMapper.insertNewBook(book);
    }

    public int updateBook(Book book) {
        return bookMapper.updateBook(book);
    }

    public int deleteBook(long id) {
        return bookMapper.deleteById(id);
    }
}
