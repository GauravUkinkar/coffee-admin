package com.Coffie_Admin_Panel.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;


@Configuration
public class SwaggerConfig {

	 @Bean
	    public OpenAPI customOpenAPI() {
	        return new OpenAPI()
	            .info(new Info()
	                .title("Coffie Project")
	                .version("1.0")
	                .description("API documentation for Coffie Project "));
	    }

}
