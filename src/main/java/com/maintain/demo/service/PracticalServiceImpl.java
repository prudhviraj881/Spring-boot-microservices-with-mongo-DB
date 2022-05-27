package com.maintain.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.maintain.demo.domain.Practical;
import com.maintain.demo.repository.PracticalRepo;

@Component

public class PracticalServiceImpl implements PracticalService {
	@Autowired
	PracticalRepo practicalRepo;

	@Override
	public List<Practical> fetchAllData() {
		
		return (List<Practical>) practicalRepo.findAll();
	}

	@Override
	public void pushData(Practical practical) {
		practicalRepo.save(practical);
		return;
		
	}

}
