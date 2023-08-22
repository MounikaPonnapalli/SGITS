package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;
import com.example.demo.exceptions.BookNotFoundException;
import com.example.demo.service.BookService;

@RestController
@RequestMapping("/library")
@ControllerAdvice
public class LibraryController 
{
    @Autowired
    private BookService bookService;
    
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String, String>> handleException(Exception e) {
        Map<String, String> response = new HashMap<>();
        response.put("error", "An error occurred");
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
    }

    @ExceptionHandler(BookNotFoundException.class)
    public ResponseEntity<Map<String, String>> handleBookNotFoundException(BookNotFoundException e) {
        Map<String, String> response = new HashMap<>();
        response.put("error", e.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
    }
    
    
    @PostMapping("/addBook")
    public ResponseEntity<Book> addBook(@RequestBody Book book) 
    {
        try 
        {
            Book addedBook = bookService.saveBook(book);
            return ResponseEntity.ok(addedBook);
        } 
        catch (Exception e) 
        {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    
    @GetMapping("/books")
    public List<Book> getAllBooks() 
    {
        return bookService.getAllBooks();
    }

    @GetMapping("/book")
    public ResponseEntity<Map<String, String>> getBookById(@RequestParam("id") Long id) 
    {
        Book book = bookService.getBookById(id);
        if (book != null) 
        {
            return ResponseEntity.ok(new HashMap<>());
        } 
        else 
        {
            throw new BookNotFoundException("Book not available");
        }
    }
    @GetMapping("/available")
    public ResponseEntity<List<Book>> getAvailableBooks() {
        List<Book> availableBooks = bookService.getAvailableBooks();
        return ResponseEntity.ok(availableBooks);
    }


    @PutMapping("/updateToTrue")
    public ResponseEntity<Map<String, String>> updateBookAvailabilityToTrue(@RequestParam("id") Long id) 
    {
        try 
        {
            boolean updated = bookService.updateBookAvailabilityToTrue(id);
            if (updated) 
            {
                Map<String, String> response = new HashMap<>();
                response.put("message", "Book availability updated to true");
                return ResponseEntity.ok(response);
            } 
            else 
            {
                throw new RuntimeException("Book is already available. No update needed.");
            }
        } 
        catch (Exception e) 
        {
            throw new RuntimeException("An error occurred while updating book availability");
        }
    }

    @PutMapping("/updateToFalse")
    public ResponseEntity<Map<String, String>> updateBookAvailabilityToFalse(@RequestParam("id") Long id)
    {
        try 
        {
            boolean updated = bookService.updateBookAvailabilityToFalse(id);

            if (updated) 
            {
                Map<String, String> response = new HashMap<>();
                response.put("message", "Book availability updated to false");
                return ResponseEntity.ok(response);
            } 
            else 
            {
                throw new RuntimeException("Book is not available for update");
            }
        } 
        catch (Exception e) 
        {
            throw new RuntimeException("An error occurred while updating book availability");
        }
    }

    @DeleteMapping("/deleteBook")
    public ResponseEntity<Map<String, String>> deleteBook(@RequestParam("id") Long id) 
    {
        try 
        {
            Book existingBook = bookService.getBookById(id);

            if (existingBook != null)
            {
                boolean deleted = bookService.deleteBook(id);

                if (deleted) 
                {
                    Map<String, String> response = new HashMap<>();
                    response.put("message", "Book deleted successfully");
                    return ResponseEntity.ok(response);
                } 
                else 
                {
                    throw new RuntimeException("Book not available for deletion");
                }
            } 
            else
            {
                throw new BookNotFoundException("Book id is not found");
            }
        } 
        catch (Exception e) 
        {
            throw new RuntimeException("An error occurred while deleting the book");
        }
    }

} 