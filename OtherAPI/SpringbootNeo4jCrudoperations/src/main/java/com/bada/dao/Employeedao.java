package com.bada.dao;

import com.bada.model.utils.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Employeedao extends MongoRepository<Employee, Integer> {

}
