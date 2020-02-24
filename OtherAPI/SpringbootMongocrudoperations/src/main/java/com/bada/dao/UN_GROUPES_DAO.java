package com.bada.dao;

import com.bada.model.UN_CNU;
import com.bada.model.UN_GRADE;
import com.bada.model.UN_GROUPES;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UN_GROUPES_DAO extends MongoRepository<UN_GROUPES, Integer> {
    Optional<UN_GROUPES> findByCODE(String CODE);

}
