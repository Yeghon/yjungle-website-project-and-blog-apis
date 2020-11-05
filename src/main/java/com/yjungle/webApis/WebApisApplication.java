package com.yjungle.webApis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

//@EnableJpaRepositories("com.yjungle.webApis.repository")
//@EntityScan("com.yjungle.webApis.entity")
@SpringBootApplication(scanBasePackages = "com.yjungle.webApis")
@EnableScheduling
public class WebApisApplication {
	private static final Logger logger = LoggerFactory.getLogger(WebApisApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(WebApisApplication.class, args);
	}

}
