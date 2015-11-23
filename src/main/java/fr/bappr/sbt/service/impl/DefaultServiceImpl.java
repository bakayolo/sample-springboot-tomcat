package fr.bappr.sbt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.bappr.sbt.model.DefaultModel;
import fr.bappr.sbt.repository.DefaultRepository;
import fr.bappr.sbt.service.DefaultService;

@Service
public class DefaultServiceImpl implements DefaultService {

	/** repository */
	@Autowired
	private DefaultRepository repo;

	public DefaultModel getModel() {
		DefaultModel model = repo.getModel();
		model.setMsg("Hello World !");
		return model;
	}

}
