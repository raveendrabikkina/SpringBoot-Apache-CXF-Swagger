package com.springboot.jaxrs.features;

import org.apache.cxf.feature.Feature;
import org.apache.cxf.jaxrs.swagger.Swagger2Feature;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JaxrsFeatures {

	@Value("${cxf.path}")
	private String basePath;

	@Bean("swagger2Feature")
	public Feature swagger2Feature() {
		/*
		 * These can be added in application.yml classes-scan: true
		 * classes-scan-packages: com.springboot,com.fasterxml.jackson.jaxrs
		 */
		Swagger2Feature result = new Swagger2Feature();
		result.setTitle("Spring Boot + CXF + Swagger");
		result.setDescription("Spring Boot + CXF + Swagger description");
		result.setBasePath(this.basePath);
		result.setVersion("V1.0");
		result.setContact("Ravi Bikkina");
		result.setSchemes(new String[] { "http", "https" });
		result.setPrettyPrint(true);
		
		return result;
	}
}