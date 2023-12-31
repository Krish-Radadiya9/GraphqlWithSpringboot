package com.graphql.learn;

import com.graphql.learn.entities.Book;

import com.graphql.learn.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqlProjectApplication implements CommandLineRunner {

    @Autowired
    private BookService bookService;

    public static void main(String[] args) {
        SpringApplication.run(GraphqlProjectApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
       /* Book b1 = new Book();
        b1.setTitle("Complete Reference");
        b1.setDescription("For learning java");
        b1.setAuthor("XYZ");
        b1.setPrice(5000);
        b1.setPages(2000);

        Book b2 = new Book();
        b2.setTitle("Think Java");
        b2.setDescription("For learning java");
        b2.setAuthor("ABC");
        b2.setPrice(5000);
        b2.setPages(3000);


        Book b3 = new Book();
        b3.setTitle("Head first to java");
        b3.setDescription("For starting java concepts");
        b3.setAuthor("PQR");
        b3.setPrice(2000);
        b3.setPages(1000);

        this.bookService.create(b1);
        this.bookService.create(b2);
        this.bookService.create(b3);*/
    }
}
