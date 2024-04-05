package com.example.gestion_livres.controller;

import com.example.gestion_livres.dto.BookDto;
import com.example.gestion_livres.dto.ResponseDto;
import com.example.gestion_livres.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
@CrossOrigin("*")
@AllArgsConstructor
public class BookController {
    private final BookService bookService;

    @GetMapping
    public ResponseEntity<List<BookDto>> getAllBooks(){
        return ResponseEntity.status(HttpStatus.OK)
                .body(bookService.getAllBooks());
    }

    @PostMapping
    public ResponseEntity<ResponseDto> create(@RequestBody BookDto bookDto){
        bookService.create(bookDto);
        return ResponseEntity.status(HttpStatus.OK)
                .body(new ResponseDto("200","book adde success"));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<ResponseDto> delete(@PathVariable("id") int id){
        bookService.deleteBook(id);
        return ResponseEntity.status(HttpStatus.OK)
                .body(new ResponseDto("200","book removed success"));
    }
}
