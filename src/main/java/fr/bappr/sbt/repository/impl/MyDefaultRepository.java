package fr.bappr.sbt.repository.impl;

import org.springframework.stereotype.Repository;

import fr.bappr.sbt.model.DefaultModel;
import fr.bappr.sbt.repository.MyRepository;

@Repository
public class MyDefaultRepository implements MyRepository {

	public DefaultModel getModel() {
		return new DefaultModel();
	}

}
