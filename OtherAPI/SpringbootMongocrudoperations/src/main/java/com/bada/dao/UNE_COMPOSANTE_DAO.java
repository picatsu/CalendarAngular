package com.bada.dao;

import com.bada.model.UNE_COMPOSANTE;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UNE_COMPOSANTE_DAO extends MongoRepository<UNE_COMPOSANTE, Integer> {

}
