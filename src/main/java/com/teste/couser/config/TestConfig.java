package com.teste.couser.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.teste.couser.entities.User;
import com.teste.couser.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository; 
	
	
	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null,"Gabryel","Gabryel@gmail.com","123456789","11223311");
		User u2 = new User(null,"Marcos","Marcos@gmail.com","987654321","99886655");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
	}

}
