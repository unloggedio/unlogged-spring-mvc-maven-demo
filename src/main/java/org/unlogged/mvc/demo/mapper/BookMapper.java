package org.unlogged.mvc.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.unlogged.mvc.demo.model.Book;

import java.util.List;

@Mapper
public interface BookMapper {
    @Select("SELECT * FROM BOOKS WHERE id = #{id}")
    Book getArticle(@Param("id") Long id);

    @Select("SELECT * FROM BOOKS")
    List<Book> getAll();
}