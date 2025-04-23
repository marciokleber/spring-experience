package com.github.marciokleber.springsecurity;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringExperienceSpringSecurity implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringExperienceSpringSecurity.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("SPRING EXPERIENCE SPRING-SECURITY PROJECT");
    }
}
