package com.bada.dao;

import com.bada.model.utils.LES_CONGES;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LES_CONGES_DAO extends MongoRepository<LES_CONGES, Integer> {

}
