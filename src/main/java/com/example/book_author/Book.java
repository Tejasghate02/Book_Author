package com.example.book_author;

public class Book {
    private String bookName;
    private String authorName;
    private int pages;

    public Book(String bookName, String authorName, int pages) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.pages = pages;
    }
    public Book(){

    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
