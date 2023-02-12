package com.example.book_author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    BookRepository bookRepository = new BookRepository();

    public String addBook(Book book){
        return bookRepository.addBook(book);
    }
    public String addAuthor(Author author){
        return bookRepository.addAuthor(author);
    }
    public String getHighestNumberPagesBook(){
        return bookRepository.getHighestNumberPagesBook();
    }
    public void updateBookPages(String bookName, int extraPages){
        bookRepository.updateBookPages(bookName, extraPages);
    }
    public String getAuthorWithHighestPages(){
        return bookRepository.getAuthorWithHighestPages();
    }
}
