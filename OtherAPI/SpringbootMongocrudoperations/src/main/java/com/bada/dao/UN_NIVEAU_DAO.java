package com.bada.dao;

import com.bada.model.UN_CNU;
import com.bada.model.UN_NIVEAU;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UN_NIVEAU_DAO extends MongoRepository<UN_NIVEAU, Integer> {

    Optional<UN_NIVEAU> findByCODE(String CODE);

}
