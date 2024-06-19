package org.unlogged.mvc.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Book implements Serializable {
    private Long id;
    private String title;
    private String author;
}