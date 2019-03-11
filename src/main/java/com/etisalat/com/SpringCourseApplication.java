package com.etisalat.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@ComponentScan(basePackages={"com.etisalat.controllers","com.etisalat.integrations","com.etisalat.services","com.etisalat.utils"}) 
@SpringBootApplication
@EntityScan(basePackages={"com.etisalat.models"}) 

@EnableJpaRepositories(basePackages={"com.etisalat.repository"}) 
public class SpringCourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCourseApplication.class, args);
	}

}
