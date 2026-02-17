package com.example.firstSpringProject.services;

import com.example.firstSpringProject.entity.Book;
import com.example.firstSpringProject.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

//    public BookService(BookRepository bookRepository) {
//        this.bookRepository = bookRepository;
//    }

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    public void add(Book book) {
        bookRepository.save(book);
    }

    public String delete(int id) {
        if (bookRepository.existsById(id)){
            Book book = bookRepository.findById(id).get();
            bookRepository.deleteById(id);
            return book.getName()+" deleted";
        }
        return "failed";
    }

    public Book findById(int id) {
        return bookRepository.findById(id).get();
    }

    public String update(int id, Book book) {
        if (bookRepository.existsById(id)) {
            Book book1 = bookRepository.findById(id).get();
            book1.setName(book.getName());
            book1.setAuthor(book.getAuthor());
            book1.setCategory(book.getCategory());
            bookRepository.save(book1);
            return book1.getName()+" updated";
        }
        else
            return "id not found";
    }
}
