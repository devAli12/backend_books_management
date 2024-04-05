package com.example.gestion_livres.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor @Data
@NoArgsConstructor
public class ResponseDto {
    private String status;
    private String message;
}
