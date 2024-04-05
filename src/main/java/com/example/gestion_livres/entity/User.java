package com.example.gestion_livres.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity @Builder @AllArgsConstructor
@NoArgsConstructor @Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String firstName;

    private String lastName;

    @OneToMany(mappedBy = "user")
    private List<Evaluation> evaluations;

    @OneToMany(mappedBy = "user")
    private List<FavoirBook> favoirBooks;

}
