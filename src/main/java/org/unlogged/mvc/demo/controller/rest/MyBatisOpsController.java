package org.unlogged.mvc.demo.controller.rest;

import io.unlogged.UnloggedMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.unlogged.mvc.demo.mapper.BookMapper;
import org.unlogged.mvc.demo.model.Book;
import org.unlogged.mvc.demo.service.BookRestService;

import java.util.List;

@RestController
@RequestMapping("/rest/mybatis")
public class MyBatisOpsController {

    @Autowired
    private BookRestService bookRestService;

    public Book getBookById(long id) {
        return bookRestService.getArticleById(id);
    }

    @UnloggedMethod(counter = "1")
    @RequestMapping("/getall")
    public List<Book> getAllBooks() {
        System.out.println("GetAll invoked");
        return bookRestService.getAll();
    }

    public int insertBook(Book book) {
        return bookRestService.insertNewBook(book);
    }

    public int updateBook(Book book) {
        return bookRestService.updateBook(book);
    }

    public int deleteBook(long id) {
        return bookRestService.deleteById(id);
    }
}
