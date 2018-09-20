package com.codegym.formatter;

import com.codegym.model.Writer;
import com.codegym.service.WriterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;

@Component
public class WriterFormatter implements Formatter<Writer> {
    private WriterService writerService;

    @Autowired
    public WriterFormatter(WriterService writerService) {
        this.writerService = writerService;
    }

    @Override
    public Writer parse(String text, Locale locale) throws ParseException {
        return writerService.findById(Long.parseLong(text));
    }

    @Override
    public String print(Writer object, Locale locale) {
        return "[" + object.getId() + ", " + object.getName() + "]";
    }
}
