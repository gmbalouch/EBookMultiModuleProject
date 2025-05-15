package org.Ebook.order_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {
		"org.Ebook.order_service",              // local beans
		"org.Ebook.common_entities.security",   // JwtFilter
		"org.Ebook.common_entities.util"        // JwtUtil
})
@EntityScan(basePackages = "org.Ebook.common_entities.entities")
@EnableJpaRepositories(basePackages = "org.Ebook.order_service.repository")
public class OrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}

}
