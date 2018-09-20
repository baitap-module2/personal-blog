package com.codegym.repository;

import com.codegym.model.Writer;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface WriterRepository extends PagingAndSortingRepository<Writer, Long> {
}
