package com.doublek.assistent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableJpaRepositories
@SpringBootApplication
public class AssistentApplication {

    public static void main(String[] args) {
        SpringApplication.run(AssistentApplication.class, args);
    }

}
