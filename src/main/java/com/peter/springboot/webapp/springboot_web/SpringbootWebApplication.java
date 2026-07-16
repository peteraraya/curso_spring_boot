package com.peter.springboot.webapp.springboot_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Clase principal que inicializa la aplicación Spring Boot.
 */
@SpringBootApplication
public class SpringbootWebApplication {

	/**
	 * Método principal que sirve como punto de entrada de la aplicación.
	 * 
	 * @param args Argumentos de línea de comandos.
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringbootWebApplication.class, args);
	}

}
