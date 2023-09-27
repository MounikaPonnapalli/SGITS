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
    
    @Autowired 
    private MailService mailService;

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
    	/*Book book = null;
    	if(id!=null && id!=0)
    	{
    		boolean flag = bookRepository.existsById(id);
    	}
    	if(flag)
    	{
    		Book book = null;
            StringBuilder builder=new StringBuilder();
            builder.append(book.getId()+" "+book.getAuthor()+" "+book.isAvailable()+" "+book.getTitle());
            mailService.sendMail("pravee1247@gmail.com",book.getTitle(),builder.toString());*/
            return bookRepository.findById(id).orElse(null);
    }

    public boolean updateBookAvailabilityToTrue(Long id) 
    {
    	
        Book existingBook = bookRepository.findById(id).orElse(null);
        if (existingBook != null) 
        {
            existingBook.setAvailable(true);
            bookRepository.save(existingBook);
            mailService.sendMail("pravee1247@gmail.com","Book Availability Update","The book '" + existingBook.getTitle() + "' is now available.");
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
            mailService.sendMail("pravee1247@gmail.com","Book Availability Update","The book '" + existingBook.getTitle() + "' is not available.");
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


