package com.home.demos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class SpringCloudStreamProcessApplication {

    public static void main(String[] args) {
        SpringApplication.run(
                SpringCloudStreamProcessApplication.class, args);
    }

    @Bean
    public Function<Person, Person> person() {
        return value -> {
            value.setName(value.getName().toUpperCase());
            return value;
        };
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
