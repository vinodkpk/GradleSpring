package com.example.demo;

import com.example.demo.dao.AlienRepo;
import com.example.demo.model.Alien;
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
private AlienRepo alienRepo;
	@Override
	public void run(String... args) throws Exception {
		Alien save1 = this.alienRepo.save(new Alien("Vicky", "Ruby"));
		Alien save2 = this.alienRepo.save(new Alien("Kaushal", "R"));
		Alien save3 = this.alienRepo.save(new Alien("Mat", "R"));
	}
}




