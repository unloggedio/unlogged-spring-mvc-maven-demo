package org.unlogged.mvc.demo.mapper;

import org.apache.ibatis.annotations.*;
import org.unlogged.mvc.demo.model.Book;

import java.util.List;

@Mapper
public interface BookMapper {
    @Select("SELECT * FROM BOOKS WHERE id = #{id}")
    Book getArticle(@Param("id") Long id);

    @Select("SELECT * FROM BOOKS")
    List<Book> getAll();

    @Insert("INSERT INTO BOOKS(id, title, author) " +
            " VALUES (#{id}, #{title}, #{author})")
    int insertNewBook(Book book);

    @Update("Update BOOKS set id=#{id}, " +
            " title=#{title}, author=#{author} where id=#{id}")
    int updateBook(Book book);

    @Delete("DELETE FROM BOOKS WHERE id = #{id}")
    int deleteById(@Param("id") Long id);
}