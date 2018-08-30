package com.codegym.controller;

import com.codegym.service.BlogService;
import com.codegym.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BlogController {
    @Autowired
    private CategoryService categoryService;

    @Autowired
    private BlogService blogService;
}
