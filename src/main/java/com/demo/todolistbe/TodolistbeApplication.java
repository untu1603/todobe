package com.demo.todolistbe;

import com.demo.todolistbe.auth.AuthenticationService;
import com.demo.todolistbe.auth.RegisterRequest;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static com.demo.todolistbe.user.Role.ADMIN;
import static com.demo.todolistbe.user.Role.MANAGER;

@SpringBootApplication
public class TodolistbeApplication {

    public static void main(String[] args) {
        SpringApplication.run(TodolistbeApplication.class, args);
    }
    @Bean
    public CommandLineRunner commandLineRunner(
            AuthenticationService service
    ) {
        return args -> {
            var admin = RegisterRequest.builder()
                    .email("admin@mail.com")
                    .password("password")
                    .role(ADMIN)
                    .build();
            System.out.println("Admin token: " + service.register(admin).getAccessToken());

            var manager = RegisterRequest.builder()


                    .email("manager@mail.com")
                    .password("password")
                    .role(MANAGER)
                    .build();
            System.out.println("Manager token: " + service.register(manager).getAccessToken());

        };
    }
}
