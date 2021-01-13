package com.example.demo;

import com.example.demo.dao.UserRespository;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
@Autowired 
private UserRespository userRespository;
	@Override
	public void run(String... args) throws Exception {
		this.userRespository.save(new User("Famesh","Fad","Fin@gmail.com"));
		this.userRespository.save(new User("Vamesh","Vad","Vin@gmail.com"));
		this.userRespository.save(new User("Pamesh","Pad","Pin@gmail.com"));
	}
}




