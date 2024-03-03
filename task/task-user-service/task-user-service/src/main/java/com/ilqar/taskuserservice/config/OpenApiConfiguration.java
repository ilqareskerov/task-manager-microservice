package com.ilqar.taskuserservice.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition()
public class OpenApiConfiguration {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Task API")
                        .version("1.0")
                        .description("""
                                This is a sample Spring Boot RESTful service using springdoc-openapi and OpenAPI 3.
                                """
                        ));
    }

}