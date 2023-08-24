package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	private static final Logger LOGGER = LoggerFactory.getLogger(LibraryController.class);
	
	

    @Autowired
    private BookService bookService;
    
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String, String>> handleException(Exception e) {
        Map<String, String> response = new HashMap<>();
        response.put("Message", "An error occurred");
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
    }

    @ExceptionHandler(BookNotFoundException.class)
    public ResponseEntity<Map<String, String>> handleBookNotFoundException(BookNotFoundException e) {
        Map<String, String> response = new HashMap<>();
        response.put("Message", e.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
    }
    
    
    
    @PostMapping("/addBook")
    public ResponseEntity<Book> addBook(@RequestBody Book book) 
    {
    	LOGGER.info("Adding a new book: {}");
        try 
        {
        	LOGGER.info("Book added successfully with ID: {}");
            Book addedBook = bookService.saveBook(book);
            return ResponseEntity.ok(addedBook);
        }
        catch (Exception e) 
        {
        	LOGGER.error("Error occurred while adding the book: {}", e);
            throw new BookNotFoundException("Book could not be added");
        }
    }

    
    @GetMapping("/books")
    public List<Book> getAllBooks() 
    {
    	LOGGER.info("Fetching All Books");
        return bookService.getAllBooks();
    }

    @GetMapping("/book")
    public ResponseEntity<Book> getBookById(@RequestParam("id") Long id) 
    {
    	LOGGER.info("Fetching book by ID: {}", id);
        LOGGER.warn("Make sure to check the book ID in MySQL");
        Book book = bookService.getBookById(id);
        if (book != null) 
        {
        	LOGGER.debug("Book found with ID: {}", id);
            return ResponseEntity.ok(book);
        } 
        else 
        {
        	LOGGER.warn("Book not found with ID: {}", id);
            throw new BookNotFoundException("Book not available");
        }
    }
    @GetMapping("/available")
    public ResponseEntity<List<Book>> getAvailableBooks() {
    	LOGGER.trace("Fetching all available books");
        List<Book> availableBooks = bookService.getAvailableBooks();
        LOGGER.debug("Fetched {} available books", availableBooks.size());
        return ResponseEntity.ok(availableBooks);
    }


    @PutMapping("/updateToTrue")
    public ResponseEntity<Map<String, String>> updateBookAvailabilityToTrue(@RequestParam("id") Long id)
    {
    	LOGGER.info("Updating book availability to true for ID: {}", id);
        try 
        {
            boolean updated = bookService.updateBookAvailabilityToTrue(id);
            if (updated)
            {
            	LOGGER.debug("Book availability updated to true for ID: {}", id);
                Map<String, String> response = new HashMap<>();
                response.put("message", "Book availability updated to true");
                return ResponseEntity.ok(response);
            }
            else
            {
            	LOGGER.warn("Book is already available for ID: {}", id);
                throw new BookNotFoundException("Book is already available. No update needed.");
            }
        } 
        catch (Exception e) 
        {
        	LOGGER.error("Error occurred while updating book availability for ID: {}", id, e);
            throw new BookNotFoundException("An error occurred while updating book availability");
        }
    }

    @PutMapping("/updateToFalse")
    public ResponseEntity<Map<String, String>> updateBookAvailabilityToFalse(@RequestParam("id") Long id)
    {
    	LOGGER.info("Updating book availability to false for ID: {}", id);
        try 
        {
            boolean updated = bookService.updateBookAvailabilityToFalse(id);

            if (updated) 
            {
            	LOGGER.debug("Book availability updated to false for ID: {}", id);
                Map<String, String> response = new HashMap<>();
                response.put("message", "Book availability updated to false");
                return ResponseEntity.ok(response);
            } 
            else 
            {
            	LOGGER.warn("Book is not available for update for ID: {}", id);
                throw new BookNotFoundException("Book is not available for update");
            }
        } 
        catch (Exception e) 
        {
        	LOGGER.error("Error occurred while updating book availability for ID: {}", id, e);
            throw new BookNotFoundException("An error occurred while updating book availability");
        }
    }

    @DeleteMapping("/deleteBook")
    public ResponseEntity<Map<String, String>> deleteBook(@RequestParam("id") Long id) 
    {
    	LOGGER.warn("Deleting book with ID: {}", id);
        try 
        {
            Book existingBook = bookService.getBookById(id);

            if (existingBook != null)
            {
                boolean deleted = bookService.deleteBook(id);

                if (deleted) 
                {
                	LOGGER.info("Book with ID {} deleted successfully", id);
                    Map<String, String> response = new HashMap<>();
                    response.put("message", "Book deleted successfully");
                    return ResponseEntity.ok(response);
                } 
                else 
                {
                	LOGGER.warn("Book is not available for deletion for ID: {}", id);
                    throw new BookNotFoundException("Book not available for deletion");
                }
            } 
            else
            {
            	LOGGER.warn("Book ID {} not found for deletion", id);
                throw new BookNotFoundException("Book id is not found");
            }
        } 
        catch (Exception e) 
        {
        	LOGGER.error("Error occurred while deleting book with ID: {}", id, e);
            throw new BookNotFoundException("An error occurred while deleting the book");
        }
    }

} 