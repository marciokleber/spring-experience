package com.github.marciokleber.springstatemachine;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringExperienceStateMachine implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringExperienceStateMachine.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("SPRING EXPERIENCE STATE MACHINE PROJECT");
    }
}
