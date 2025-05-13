package org.Ebook.user_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"org.Ebook.common_entities.entities"})
@EnableJpaRepositories(basePackages = {"org.Ebook.user_service.reporistory"})
@ComponentScan(basePackages = {
		"org.Ebook.user_service",
		"org.Ebook.common_entities"
})
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

}
