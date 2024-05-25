package com.example.bookStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookStore.model.MyBooks;
import com.example.bookStore.repository.MyBooksDao;

@Service
public class MyBookService {
    @Autowired
    MyBooksDao myBooksDao;
    public void saveBooks(MyBooks book){
        myBooksDao.save(book);
    }
    public List<MyBooks> getMyBookList(){
        return myBooksDao.findAll();
    }
}
