package com.example;

public class BookService {
    private String libraryName;
    private BookRepository bookRepository;

    public BookService(String libraryName) {
        this.libraryName = libraryName;
    }

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void showBook() {
        System.out.println("Library: " + libraryName);
        bookRepository.displayBook();
    }
}

