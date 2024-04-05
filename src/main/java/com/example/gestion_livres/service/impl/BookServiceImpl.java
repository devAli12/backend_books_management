package com.example.gestion_livres.service.impl;

import com.example.gestion_livres.dto.BookDto;
import com.example.gestion_livres.entity.Book;
import com.example.gestion_livres.repository.BookRepository;
import com.example.gestion_livres.repository.UserRepository;
import com.example.gestion_livres.service.BookService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    private final ModelMapper modelMapper;

    @Override
    public void create(BookDto bookDto) {
        Book book = modelMapper.map(bookDto, Book.class);
        bookRepository.save(book);
    }

    @Override
    public List<BookDto> getAllBooks() {
        List<Book> books= bookRepository.findAll();
        List<BookDto> bookDtos = new ArrayList<>();

        for (Book book :books) bookDtos.add(modelMapper.map(book,BookDto.class));
        return bookDtos;
    }

    @Override
    public void deleteBook(int id) {
         bookRepository.deleteById(id);
    }
}
