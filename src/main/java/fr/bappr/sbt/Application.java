package fr.bappr.sbt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Point d'entrée unique de l'application
 * 
 * @author BAPPR
 *
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application {

	/** main */
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}

}