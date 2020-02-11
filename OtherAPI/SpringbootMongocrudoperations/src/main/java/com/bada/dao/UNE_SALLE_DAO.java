package com.bada.dao;


import com.bada.model.UNE_SALLE;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UNE_SALLE_DAO extends MongoRepository<UNE_SALLE, Integer> {

}

