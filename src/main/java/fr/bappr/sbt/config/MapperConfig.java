package fr.bappr.sbt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Configuration du mapping
 * 
 * @author BAPPR
 *
 */
@Configuration
public class MapperConfig {

	/**
	 * Renvoyer le singleton pour le mapping JSON
	 * 
	 * @return
	 */
	@Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
	}

}
