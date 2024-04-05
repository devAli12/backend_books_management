package com.example.gestion_livres.repository;

import com.example.gestion_livres.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
