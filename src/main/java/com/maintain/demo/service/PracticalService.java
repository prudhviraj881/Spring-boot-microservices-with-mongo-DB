package com.maintain.demo.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.maintain.demo.domain.Practical;

@Service
public interface PracticalService {

	List<Practical> fetchAllData();

	void pushData(Practical practical);

}
