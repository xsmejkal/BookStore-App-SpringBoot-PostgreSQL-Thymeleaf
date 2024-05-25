package com.example.bookStore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class MyBooks {
    
    public MyBooks(Integer id, String author, String name, String price) {
        //TODO Auto-generated constructor stub
        this.id = id;
        this.author = author;
        this.name = name;
        this.price = price;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String author;
    private String name;
    private String price;
}
