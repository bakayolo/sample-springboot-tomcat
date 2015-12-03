package fr.bappr.sbt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.bappr.sbt.model.DefaultModel;
import fr.bappr.sbt.repository.MyRepository;
import fr.bappr.sbt.service.MyService;

@Service
public class MyDefaultService implements MyService {

	/** repository */
	@Autowired
	private MyRepository repo;

	@Override
    public DefaultModel getModel() {
		DefaultModel model = this.repo.getModel();
		model.setMsg("Hello World !");
		return model;
	}

}
