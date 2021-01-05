package com.home.demos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.function.Supplier;

@SpringBootApplication
public class SpringCloudStreamApplication {

    public static void main(String[] args) {
        SpringApplication.run(
                SpringCloudStreamApplication.class, args);
    }

    @Bean
    public Supplier<Person> person() {
        return () -> new Person("test: " + LocalDateTime.now());
    }

    public static class Person {
        private String name;

        public Person(String name) {
            this.name = name;
        }

        public Person() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String toString() {
            return this.name;
        }
    }
}
