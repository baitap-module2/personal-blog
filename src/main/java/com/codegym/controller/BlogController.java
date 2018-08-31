package com.codegym.controller;

import com.codegym.model.Blog;
import com.codegym.model.Category;
import com.codegym.service.BlogService;
import com.codegym.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

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

    //    hiển thị danh sách
    @GetMapping("/blogs")
    public ModelAndView listBlog() {
        Iterable<Blog> blogs = blogService.findAll();
        ModelAndView modelAndView = new ModelAndView("/blog/list");
        modelAndView.addObject("blogs", blogs);
        return modelAndView;
    }
}
