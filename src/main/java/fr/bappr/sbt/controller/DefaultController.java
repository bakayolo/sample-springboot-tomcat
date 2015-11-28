package fr.bappr.sbt.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.bappr.sbt.model.DefaultModel;
import fr.bappr.sbt.service.DefaultService;

/**
 * Controller
 * 
 * @author BAPPR
 * 
 */
@RestController
@RequestMapping(value= "/api/default")
public class DefaultController {

	/** Logger */
	private final Logger LOGGER = Logger.getLogger(DefaultController.class);

	@Autowired
	private DefaultService defaultService;

	@RequestMapping(method= RequestMethod.GET)
	public DefaultModel get() {
		LOGGER.info("Entree dans la methode");

		return defaultService.getModel();
	}

}
