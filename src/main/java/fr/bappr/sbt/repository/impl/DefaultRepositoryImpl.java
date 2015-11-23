package fr.bappr.sbt.repository.impl;

import org.springframework.stereotype.Repository;

import fr.bappr.sbt.model.DefaultModel;
import fr.bappr.sbt.repository.DefaultRepository;

@Repository
public class DefaultRepositoryImpl implements DefaultRepository {

	public DefaultModel getModel() {
		return new DefaultModel();
	}

}