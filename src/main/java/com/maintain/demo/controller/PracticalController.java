package com.maintain.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.maintain.demo.domain.Practical;
import com.maintain.demo.service.PracticalService;

@RestController
public class PracticalController {
	@Autowired
	PracticalService practicalService;
	
	@RequestMapping(value="/data", method=RequestMethod.POST)
	String data(@RequestBody Practical practical) {
		practicalService.pushData(practical);
		return "Data Saved Successfully...................!";
	}
	@RequestMapping(value="/get", method=RequestMethod.GET)
	ResponseEntity <List<Practical>> storeData() {
		List<Practical> a = practicalService.fetchAllData();
		return ResponseEntity.ok(a);
	}
	

}
