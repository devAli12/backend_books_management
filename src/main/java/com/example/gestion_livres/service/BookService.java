package com.example.gestion_livres.service;

import com.example.gestion_livres.dto.BookDto;

import java.util.List;

public interface BookService {
      void create(BookDto bookDto);

      List<BookDto> getAllBooks();

      void deleteBook(int id);
}
