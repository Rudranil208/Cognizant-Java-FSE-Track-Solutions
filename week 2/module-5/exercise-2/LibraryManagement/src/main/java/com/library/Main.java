package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.service.BookService;
import com.library.repository.BookRepository;

public class Main {

    public static void main(String[] args) {

        // Load the Spring configuration file
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve beans from the Spring container
        BookService service = context.getBean("bookService", BookService.class);
        BookRepository repository = context.getBean("bookRepository", BookRepository.class);

        // Test the beans
        service.displayService();
        repository.displayRepository();

        // Close the context
        ((ClassPathXmlApplicationContext) context).close();
    }
}
