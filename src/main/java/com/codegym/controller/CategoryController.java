package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/")
public class CategoryController {
    @GetMapping("/")
    public String showForm(Model model) {
        return "list";
    }
}
