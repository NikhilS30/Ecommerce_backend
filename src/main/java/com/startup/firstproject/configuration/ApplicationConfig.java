package com.startup.firstproject.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/* here what spring will do is it will treat this class as config class and will
 * create objects of all the beans in this and would make globally accessible whereever required
 * 
 */
@Configuration
public class ApplicationConfig {
	
	/*
	 * now what spring will do is spring will make a single obj of this and inject
	 * wherever called or autowire this
	 */
	@Bean
	public RestTemplate Restconfig() {
		return new RestTemplate();
	}

}
