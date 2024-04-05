package com.example.gestion_livres.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor @Builder
@AllArgsConstructor @Data
public class Emprunt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private LocalDateTime dateDebutEmprunt;

    private LocalDateTime dateFinEmprunt;

    @ManyToOne
    private Book book;

    @ManyToOne
    private User user;
}
