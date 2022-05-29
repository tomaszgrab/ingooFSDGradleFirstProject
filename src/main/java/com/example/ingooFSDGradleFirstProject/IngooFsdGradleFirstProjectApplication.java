package com.example.ingooFSDGradleFirstProject;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class IngooFsdGradleFirstProjectApplication  implements CommandLineRunner {

	@Autowired
	private ApplicationContext applicationContext;

	public static void main(String[] args) {
		SpringApplication.run(IngooFsdGradleFirstProjectApplication.class, args);
		System.out.println("gggg");
	}


	@Override
	public void run(String... args) throws Exception {

		MyBean5 bean = applicationContext.getBean(MyBean5.class);
		bean.soutHello();

	}
}
