package com.bada.dao;

import com.bada.model.UN_CNU;
import com.bada.model.UN_ETUDIANT;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UN_ETUDIANT_DAO extends MongoRepository<UN_ETUDIANT, Integer> {
    Optional<UN_ETUDIANT> findByCODE(String CODE);

    void deleteByCODE(String CODE);
}
