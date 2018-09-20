package com.codegym.service;

import com.codegym.model.Writer;
import com.codegym.repository.WriterRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class WriterServiceImpl implements WriterService {
    @Autowired
    private WriterRepository writerRepository;

    @Override
    public Iterable<Writer> findAll() {
        return writerRepository.findAll();
    }

    @Override
    public Writer findById(Long id) {
        return writerRepository.findOne(id);
    }

    @Override
    public void save(Writer writer) {
        writerRepository.save(writer);
    }

    @Override
    public void remove(Long id) {
        writerRepository.delete(id);
    }
}
