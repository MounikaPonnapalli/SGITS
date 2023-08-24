package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;
@Service
public class BookService 
{
	
    @Autowired
    private BookRepository bookRepository;

    public Book saveBook(Book book) 
    {
        return bookRepository.save(book);
    }

    public List<Book> getAllBooks() 
    {
    	
        return bookRepository.findAll();
    }
    
    public List<Book> getAvailableBooks() 
    {
    	
        return bookRepository.findByAvailable(true);
    }

    public Book getBookById(Long id) 
    {
    	
        return bookRepository.findById(id).orElse(null);
    }

    public boolean updateBookAvailabilityToTrue(Long id) 
    {
    	
        Book existingBook = bookRepository.findById(id).orElse(null);
        if (existingBook != null) 
        {
            existingBook.setAvailable(true);
            bookRepository.save(existingBook);
            return true;
        }
        return false;
    }

    public boolean updateBookAvailabilityToFalse(Long id) 
    {
        Book existingBook = bookRepository.findById(id).orElse(null);
        if (existingBook != null) 
        {
            existingBook.setAvailable(false);
            bookRepository.save(existingBook);
            return true;
        }
        return false;
    }

    public boolean deleteBook(Long id) 
    {
        Book existingBook = bookRepository.findById(id).orElse(null);
        if (existingBook != null) 
        {
            bookRepository.delete(existingBook);
            return true;
        }
        return false;
    }
}


