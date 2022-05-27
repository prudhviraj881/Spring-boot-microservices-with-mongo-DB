package com.maintain.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.maintain.demo.domain.Practical;
@Repository
public interface PracticalRepo extends MongoRepository <Practical, String  > {

	List<Practical> findAll();

}
