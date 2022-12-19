package com.example.newspringboot;

import com.example.newspringboot.model.LombokPOJO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NewSpringBootApplication {

    public static void main(String[] args) {
        LombokPOJO lombokPOJO = LombokPOJO.builder().name("zimug").age(20).build();
        SpringApplication.run(NewSpringBootApplication.class, args);
    }

}
