package fr.bappr.sbt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Point d'entrée unique de l'application
 * 
 * @author BAPPR
 *
 */
@SpringBootApplication
public class Application {

	/** main */
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}

}