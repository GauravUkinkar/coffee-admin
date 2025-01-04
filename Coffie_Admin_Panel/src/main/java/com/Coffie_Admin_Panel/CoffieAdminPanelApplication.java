package com.Coffie_Admin_Panel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.Coffie_Admin_Panel")
public class CoffieAdminPanelApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoffieAdminPanelApplication.class, args);
	}

}
