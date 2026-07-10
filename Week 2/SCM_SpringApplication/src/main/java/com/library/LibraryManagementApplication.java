package com.library;

import com.library.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        try {
            BookService bookService = context.getBean("bookService", BookService.class);
            System.out.println("Spring Context loaded successfully.");
            bookService.showBook();
            System.out.println("BookService successfully called BookRepository.");
        } finally {
            context.close();
        }
    }
}

