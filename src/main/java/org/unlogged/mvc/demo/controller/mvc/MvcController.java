package org.unlogged.mvc.demo.controller.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.unlogged.mvc.demo.mapper.BookMapper;

@Controller
@RequestMapping("/mvc")
public class MvcController {

    @Autowired
    private BookMapper bookMapper;

    @RequestMapping("/home")
    public String loadAllBooks(Model model) {
        model.addAttribute("books", bookMapper.getAll());
        return "index";
    }
}
