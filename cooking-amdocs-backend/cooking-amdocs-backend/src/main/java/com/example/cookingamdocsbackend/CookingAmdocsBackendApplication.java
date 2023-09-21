package com.example.cookingamdocsbackend;

import com.example.cookingamdocsbackend.model.User;
import com.example.cookingamdocsbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CookingAmdocsBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CookingAmdocsBackendApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
//		User user = new User();
//		user.setName("Ayush");
//		user.setAge(24);
//		user.setEmail("ayush@gmail.com");
//		userRepository.save(user);
//
//		User user1 = new User();
//		user1.setName("Ashis");
//		user1.setAge(24);
//		user1.setEmail("ashis@gmail.com");
//
//		userRepository.save(user1);
	}
}
