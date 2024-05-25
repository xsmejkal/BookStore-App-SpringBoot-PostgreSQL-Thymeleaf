package com.example.bookStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.bookStore.model.Book;
import com.example.bookStore.model.MyBooks;
import com.example.bookStore.service.BookService;
import com.example.bookStore.service.MyBookService;

@Controller
public class BookController {
    @Autowired
    BookService bookService;

    @Autowired
    MyBookService myBookService;
    
    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("register")
    public String register(){
        return "register";
    }
    @GetMapping("allBookList")
    public ModelAndView getBookList(){
        List<Book> books =  bookService.getBookList();
        // ModelAndView m = new ModelAndView();
        // m.setViewName("bookList");
        // m.addObject("b", books);
        return new ModelAndView("allBookList","b",books);
    }
    @GetMapping("myBookList")
    public String getMyBooks(Model model){
        List<MyBooks> mb = myBookService.getMyBookList();
        model.addAttribute("book", mb);
        return "myBookList";
    }

    @PostMapping("save")
    public String addBook(@ModelAttribute Book book){
        
        bookService.addBook(book);
        return "redirect:/allBookList";
    }

    @RequestMapping("myList/{id}")
    public String getMyList(@PathVariable("id") Integer id){
        Book b = bookService.getBookById(id);
        MyBooks mb = new MyBooks(b.getId(),b.getAuthor(),b.getName(),b.getPrice());
        myBookService.saveBooks(mb);
        return "redirect:/myBookList";
    }

    @RequestMapping("editBook/{id}")
    public String editBook(@PathVariable("id") Integer id, Model model){
        Book b = bookService.getBookById(id);
        model.addAttribute("book", b);
        return "editBook";
    }
}
