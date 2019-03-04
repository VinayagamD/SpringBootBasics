package com.vinay.springboot.basics.controllers;

import com.vinay.springboot.basics.models.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BooksController {

    @GetMapping("/allbooks")
    public List<Book> getAllBoks(){
        return Arrays.asList(new Book(2l,"Learn Spring Basic3","Vinay Logics"));
    }
}
