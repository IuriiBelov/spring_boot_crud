package com.example.spring_boot_crud;

import com.example.spring_boot_crud.model.User;
import com.example.spring_boot_crud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootCrudApplication {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootCrudApplication.class, args);
	}

	@Bean
	public void populateDb() {
		userRepository.save(new User("Ivan", "Ivanov"));
		userRepository.save(new User("Petr", "Petrov"));
		userRepository.save(new User("Sergey", "Sergeev"));
	}
}
