package com.example.book_author;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class BookRepository {
    private HashMap<String, Book> book_db;
    private HashMap<String, Author> author_db;

    public BookRepository(){
        this.book_db = new HashMap<>();
        this.author_db = new HashMap<>();
    }

    //add book
    public String addBook(Book book){
        if(book_db.containsKey(book.getBookName())){
            return "Book already present in data base";
        }
        book_db.put(book.getBookName(), book);
        return "Book added successfully";
    }

    //add author
    public String addAuthor(Author author){
        if(author_db.containsKey(author.getName())){
            return "Author already present in data base";
        }

        author_db.put(author.getName(), author);
        return "Author added successfully";
    }

    //get book with height pages
    public String getHighestNumberPagesBook(){
        String bookName = "";
        int maxPages = 0;
        for(Book book : book_db.values()){
            if(book.getPages() > maxPages){
                maxPages = book.getPages();
                bookName = book.getBookName();
            }
        }
        return bookName;
    }

    //update pages
    public void updateBookPages(String bookName, int extraPages){
        int oldPages = book_db.get(bookName).getPages();
        book_db.get(bookName).setPages(oldPages+extraPages);
    }

    //get author with highest no of pages
    public String getAuthorWithHighestPages(){
        String authorName = "";
        int maxPages = 0;
        for(Author author : author_db.values()){
            if(author.getPages()>maxPages){
                maxPages= author.getPages();
                authorName=author.getName();
            }
        }
        return authorName;
    }
}
