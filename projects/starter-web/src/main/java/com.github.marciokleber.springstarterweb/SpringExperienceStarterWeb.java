package com.github.marciokleber.springstarterweb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringExperienceStarterWeb implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringExperienceStarterWeb.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("SPRING EXPERIENCE STARTER_WEB PROJECT");
    }
}
