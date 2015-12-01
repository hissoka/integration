package com.esprit.integrationContinue.service;

import java.util.List;

import com.esprit.integrationContinue.model.Developper;

public interface DevelopperInt {

	public abstract void addDevelopper(Developper t);

	public abstract void deleteDevelopper(Integer idTask);

	public abstract void updtaeDevelopper(Developper t);

	public abstract Developper findTaskById(Integer idTask);

	public abstract List<Developper> findAllDevelopper();
	
	public abstract List<Developper> findAllTasksbyIdUser(Integer id);
	


}
