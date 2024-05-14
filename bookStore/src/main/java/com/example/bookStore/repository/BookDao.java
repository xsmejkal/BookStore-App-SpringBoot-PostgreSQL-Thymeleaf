package com.example.bookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookStore.model.Book;

public interface BookDao extends JpaRepository<Book,Integer>{
    
}
