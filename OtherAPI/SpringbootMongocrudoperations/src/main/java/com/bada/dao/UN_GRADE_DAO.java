package com.bada.dao;

import com.bada.model.UN_CNU;
import com.bada.model.UN_GRADE;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UN_GRADE_DAO extends MongoRepository<UN_GRADE, Integer> {
    Optional<UN_GRADE> findByCODE(String CODE);

}
