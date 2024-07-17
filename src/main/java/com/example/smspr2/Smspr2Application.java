package com.example.smspr2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaAuditing
@SpringBootApplication
public class Smspr2Application {

    public static void main(String[] args) {
        SpringApplication.run(Smspr2Application.class, args);
    }

}
