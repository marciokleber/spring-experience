package com.github.marciokleber.springdefault;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringExperienceDefault implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringExperienceDefault.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("SPRING EXPERIENCE DEFAULT PROJECT");
    }
}
