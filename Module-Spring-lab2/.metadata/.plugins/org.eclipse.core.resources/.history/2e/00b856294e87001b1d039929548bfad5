package com.cg.lab2.service;

import java.util.List;

import com.cg.lab2.Exception.TraineeException;
import com.cg.lab2.entity.Trainee;

public interface ITraineeService {

	Trainee add(Trainee trainee) throws TraineeException;
	Trainee save(Trainee trainee) throws TraineeException;
	void deleteById(Long traineeId);
	
	Trainee findById(Long traineeId);
	Trainee findByTraineeName(String traineeName);
	
	List<Trainee> findAll();
	
}
