package com.sathish.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.basePackage("com.sathish.rest"))              
          .paths(PathSelectors.any())                          
          .build();
         /* .apiInfo(Metadata());*/
    }

	/*
	 * private ApiInfo Metadata() { ApiInfo apiInfo=new ApiInfo(
	 * "Spring Boot restApi", "SpringBoot restApi for SSA portal", "1.0",
	 * "Terms of service ", new
	 * Contact("Sathish","www.ashokit.in","ashokitschool@gmail.com"),
	 * 
	 * "Apache License version 2.0", "https://www.apache.org/licenses/LICENSE-2.0");
	 * 
	 * return apiInfo; }
	 */
}
