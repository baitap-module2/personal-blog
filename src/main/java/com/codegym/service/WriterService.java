package com.codegym.service;

import com.codegym.model.Writer;

public interface WriterService {
    Iterable<Writer> findAll();

    Writer findById(Long id);

    void save(Writer writer);

    void remove(Long id);
}
