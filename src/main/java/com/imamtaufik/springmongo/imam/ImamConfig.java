package com.imamtaufik.springmongo.imam;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ImamConfig {

    @Bean
    CommandLineRunner runner() {
        return args -> {
            System.out.println("imam wiiii");
        };
    };
}
