package com.bada.dao;


import com.bada.model.UNE_SALLE;
import com.bada.model.UNE_SEANCE;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UNE_SEANCE_DAO extends MongoRepository<UNE_SEANCE, Integer> {

}
