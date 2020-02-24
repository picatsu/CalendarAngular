package com.bada.dao;

import com.bada.model.UN_CNU;
import com.bada.model.UN_TYPE_ACTIVITE;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UN_TYPE_ACTIVITE_DAO extends MongoRepository<UN_TYPE_ACTIVITE, Integer> {
    Optional<UN_TYPE_ACTIVITE> findByCODE(String CODE);
}
