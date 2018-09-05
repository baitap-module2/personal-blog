package com.codegym.service;

import com.codegym.model.Blog;
import com.codegym.model.Category;

import java.sql.Blob;

public interface BlogService {
    Iterable<Blog> findAll();
    
    Blog findById(Long id);
    
    void save(Blog blog);
    
    void remove(Long id);
}
