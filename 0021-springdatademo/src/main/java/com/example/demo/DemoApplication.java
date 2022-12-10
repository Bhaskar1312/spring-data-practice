package com.example.demo;

import com.example.demo.data.entities.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.math.BigDecimal;
import java.util.Date;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		BookRepository repository = context.getBean(BookRepository.class);
		Book book = new Book();
		book.setTitle("The Book of Wisdom");
		book.setPageCount(200);
		book.setPrice(new BigDecimal("100.00"));
		book.setPublishDate(new Date());

		repository.save(book);
	}


}
