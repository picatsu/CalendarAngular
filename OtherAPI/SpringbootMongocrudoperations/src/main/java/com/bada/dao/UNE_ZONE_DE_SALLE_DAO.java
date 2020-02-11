package com.bada.dao;


import com.bada.model.UNE_ZONE_DE_SALLE;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UNE_ZONE_DE_SALLE_DAO extends MongoRepository<UNE_ZONE_DE_SALLE, Integer> {

}

