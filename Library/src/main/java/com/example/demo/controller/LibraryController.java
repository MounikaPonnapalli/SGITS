package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;

@RestController
@RequestMapping("/library")
public class LibraryController {
    @Autowired
    private BookService bookService;

    
    @PostMapping("/addBook")
    public void addBook(@RequestBody Book book) {
        bookService.saveBook(book);
    }
    
    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/available")
    public List<Book> getAvailableBooks() {
        return bookService.getAvailableBooks();
    }

    @GetMapping("/book")
    public ResponseEntity<?> getBookById(@RequestParam("id") Long id) {
        Book book = bookService.getBookById(id);
        if (book != null) {
            return ResponseEntity.ok(book);
        } else {
            //return ResponseEntity.notFound().build();
        	return ResponseEntity.badRequest().body("Book not available");
        }
    }
    
    @PutMapping("/update")
    public ResponseEntity<?> updateBook(@RequestParam("id") Long id, @RequestBody Book updatedBook) {
        Book existingBook = bookService.getBookById(id);

        if (existingBook != null) {
            if (existingBook.isAvailable()) {
                existingBook.setTitle(updatedBook.getTitle());
                existingBook.setAuthor(updatedBook.getAuthor());
                existingBook.setAvailable(updatedBook.isAvailable());

                bookService.saveBook(existingBook);

                return ResponseEntity.ok(existingBook);
            } else {
                return ResponseEntity.badRequest().body("Book is not available for update");
            }
        } else {
            return ResponseEntity.badRequest().body("Book id is not found");
        }
    }


    @DeleteMapping("/deleteBook")
    public ResponseEntity<?> deleteBook(@RequestParam("id") Long id) {
        boolean deleted = bookService.deleteBook(id);

        if (deleted) {
            return ResponseEntity.ok("Book deleted successfully");
        } else {
            return ResponseEntity.badRequest().body("Book not available for deletion");
        }
    }


/*
    @DeleteMapping("/deleteBook")
    public void deleteBook(@RequestParam("id") Long id) {
        bookService.deleteBook(id);
    }*/
}
