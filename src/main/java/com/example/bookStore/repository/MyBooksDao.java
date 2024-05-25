package com.example.bookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookStore.model.MyBooks;

public interface MyBooksDao extends JpaRepository<MyBooks,Integer>{
    
}
