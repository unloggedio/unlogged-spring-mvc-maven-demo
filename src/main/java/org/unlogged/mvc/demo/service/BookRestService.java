package org.unlogged.mvc.demo.service;

import io.unlogged.UnloggedMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.unlogged.mvc.demo.mapper.BookMapper;
import org.unlogged.mvc.demo.model.Book;

import java.util.List;

@Service
public class BookRestService {

    @Autowired
    private BookMapper bookMapper;

    public Book getArticleById(long id) {
        return bookMapper.getArticle(id);
    }

    @UnloggedMethod(counter = "1")
    public List<Book> getAll() {
        List<Book> a = listAllBooks();
        return a;
    }

    public List<Book> listAllBooks() {
        return bookMapper.getAll();
    }

    public int insertNewBook(Book book) {
        return bookMapper.insertNewBook(book);
    }

    public int updateBook(Book book) {
        return bookMapper.updateBook(book);
    }

    public int deleteById(long id) {
        return bookMapper.deleteById(id);
    }
}
