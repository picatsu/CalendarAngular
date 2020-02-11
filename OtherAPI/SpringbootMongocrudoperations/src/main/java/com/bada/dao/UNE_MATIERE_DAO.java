package com.bada.dao;

import com.bada.model.UNE_MATIERE;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UNE_MATIERE_DAO extends MongoRepository<UNE_MATIERE, Integer> {

}
