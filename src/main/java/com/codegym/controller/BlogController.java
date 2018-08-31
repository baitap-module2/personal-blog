package com.codegym.controller;

import com.codegym.model.Category;
import com.codegym.service.BlogService;
import com.codegym.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class BlogController {
    @Autowired
    private CategoryService categoryService;

    @Autowired
    private BlogService blogService;

    //    gắn danh sách các category vào tất cả các model của view
    @ModelAttribute("categories")
    Iterable<Category> categories() {
        return categoryService.findAll();
    }
}
