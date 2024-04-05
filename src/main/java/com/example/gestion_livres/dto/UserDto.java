package com.example.gestion_livres.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private int id ;
    private String firstName ;
    private String lastName;
}
