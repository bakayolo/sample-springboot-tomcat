package fr.bappr.sbt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.bappr.sbt.model.DefaultModel;
import fr.bappr.sbt.service.MyService;
import lombok.extern.slf4j.Slf4j;

/**
 * Controller
 * 
 * @author BAPPR
 * 
 */
@Slf4j
@RestController
@RequestMapping(value= "/api/default")
public class DefaultController {

	@Autowired
	private MyService myService;

	@RequestMapping(method= RequestMethod.GET)
	public DefaultModel get() {
	    log.info("Entree dans la methode");

		return this.myService.getModel();
	}

}
