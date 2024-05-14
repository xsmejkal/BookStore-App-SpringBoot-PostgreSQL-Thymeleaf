package com.example.bookStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookStore.model.Book;
import com.example.bookStore.repository.BookDao;

@Service
public class BookService {
    @Autowired
    BookDao bookDao;
    public Book addBook(Book book){
        return bookDao.save(book);
    }

    public List<Book> getBookList(){
        return bookDao.findAll();
    }

    public Book getBookById(Integer id){
        return bookDao.findById(id).get();
    }
}

