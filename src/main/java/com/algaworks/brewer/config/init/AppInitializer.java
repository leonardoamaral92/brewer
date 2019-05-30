package com.algaworks.brewer.config.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.algaworks.brewer.controller.CervejasController;

@SpringBootApplication
@ComponentScan(basePackageClasses = { CervejasController.class })
public class AppInitializer  {

	public static void main(String[] args) {
		SpringApplication.run(AppInitializer.class, args);
	}
}
