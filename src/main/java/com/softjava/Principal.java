package com.softjava;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Principal {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Principal.class).headless(false)
                .web(false)
                .run(args);
    }

    @Bean
    public Menu frame() {
        return new Menu();
    }
}
