package com.springboot.jaxrs.providers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

@Configuration
public class JaxrsProviders {

	@Bean
	public JacksonJsonProvider jsonProvider() {
		/*
		 * This can be added in application.yml to enable this other way
		 *	classes-scan: true
		 * 	classes-scan-packages: com.springboot,com.fasterxml.jackson.jaxrs
		 */
		return new JacksonJsonProvider();
	}
}
