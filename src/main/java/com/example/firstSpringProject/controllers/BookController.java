package com.example.firstSpringProject.controllers;

import com.example.firstSpringProject.entity.Book;
import com.example.firstSpringProject.entity.Client;
import com.example.firstSpringProject.service.BookService;
import com.example.firstSpringProject.services.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class BookController {
    private final BookService bookService;

//    public BookController(BookService bookService) {
//        this.bookService = bookService;
//    }

    @GetMapping("/Book")
    public List<Book> findAll()
    {
        return bookService.findAll();
    }

    @PostMapping("/Book/add")
    public Book add(@RequestBody Book Book) {
        bookService.add(Book);
        return Book;
    }

    @DeleteMapping("/Book/delete/{id}")
    public String delete(@PathVariable int id) {
        return  bookService.delete(id);
    }

    @PutMapping("/Book/update/{id}")
    public String update(@PathVariable int id, @RequestBody Book book){
        return bookService.update(id, book);
    }

    @GetMapping("/Book/{id}")
    public Book findById(@PathVariable int id) {
        return bookService.findById(id);
    }
}
