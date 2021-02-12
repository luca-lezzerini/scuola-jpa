package it.sirfin.scuolajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"it.sirfin.scuolajpa"})
@EnableJpaRepositories(basePackages = {"it.sirfin.scuolajpa.repository"})
@EntityScan(basePackages = {"it.sirfin.scuolajpa.model"})
public class ScuolajpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScuolajpaApplication.class, args);
    }

}
