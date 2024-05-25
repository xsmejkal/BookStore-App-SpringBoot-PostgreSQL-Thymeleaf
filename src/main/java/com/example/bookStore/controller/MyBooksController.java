package com.example.bookStore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

import com.example.bookStore.service.MyBookService;

@Controller
@RequestMapping("myList")
public class MyBooksController {
    
    @Autowired
    MyBookService myBookService;

    // @GetMapping("myBookList")
    // public ModelAndView getMyBookList(){
    //     List<MyBooks> mb = myBookService.getMyBookList();
    //     return new ModelAndView("myBookList","myBook",mb);
    // }
}
