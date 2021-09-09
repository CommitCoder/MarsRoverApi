package com.coderscampus;

import com.coderscampus.datasource.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MarsRoverApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarsRoverApiApplication.class, args);

//		ApplicationContext ctx = SpringApplication.run(MarsRoverApiApplication.class, args);
//		FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
//		System.out.println(fakeDataSource.getUsername());
//		System.out.println(fakeDataSource.getPassword());
//		System.out.println(fakeDataSource.getJdbcurl());





	}

}
