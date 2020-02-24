package com.bada.dao;


import com.bada.model.UN_CNU;
import com.bada.model.UN_ENSEIGNEMENT;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UN_ENSEIGNEMENT_DAO extends MongoRepository<UN_ENSEIGNEMENT, Integer> {
    Optional<UN_ENSEIGNEMENT> findByCODE(String CODE);
    void deleteByCODE(String CODE);
}
