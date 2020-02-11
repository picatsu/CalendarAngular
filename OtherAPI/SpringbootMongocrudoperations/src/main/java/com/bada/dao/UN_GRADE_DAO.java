package com.bada.dao;

import com.bada.model.UN_GRADE;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UN_GRADE_DAO extends MongoRepository<UN_GRADE, Integer> {

}
