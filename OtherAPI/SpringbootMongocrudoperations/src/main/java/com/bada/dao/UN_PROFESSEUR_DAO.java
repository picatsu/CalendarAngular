package com.bada.dao;

import com.bada.model.UN_PROFESSEUR;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UN_PROFESSEUR_DAO extends MongoRepository<UN_PROFESSEUR, Integer> {

}
