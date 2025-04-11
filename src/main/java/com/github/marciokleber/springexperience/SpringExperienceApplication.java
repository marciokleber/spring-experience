package com.github.marciokleber.springexperience;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringExperienceApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringExperienceApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

    }
}
