package com.example.gestion_livres.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor @NoArgsConstructor @Data
public class BookDto {
    private int id ;
    private  String title;
    private String genre;
    private String author;
    private String description;
    private int pages;
}
