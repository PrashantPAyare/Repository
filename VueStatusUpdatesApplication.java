package com.pearsonVue.VueStatusUpdates;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
@ComponentScan("com.pearsonVue.VueStatusUpdates")
@EntityScan("model")
@EnableJpaRepositories("Repository")
public class VueStatusUpdatesApplication {

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(VueStatusUpdatesApplication.class);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(VueStatusUpdatesApplication.class, args);
	}

}

