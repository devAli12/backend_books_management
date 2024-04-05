package com.example.gestion_livres.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity @AllArgsConstructor
@NoArgsConstructor @Builder
public class Evaluation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    private String comment;

    @OneToOne
    private Book book;

    @ManyToOne
    private User user;
}
