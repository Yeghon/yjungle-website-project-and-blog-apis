package com.yjungle.webApis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@EnableJpaRepositories("com.yjungle.webApis.repository")
//@EntityScan("com.yjungle.webApis.entity")
@SpringBootApplication(scanBasePackages = "com.yjungle.webApis")
public class WebApisApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebApisApplication.class, args);
	}

}
