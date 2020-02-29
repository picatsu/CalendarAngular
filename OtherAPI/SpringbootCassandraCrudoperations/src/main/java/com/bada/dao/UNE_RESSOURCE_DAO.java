package com.bada.dao;


import com.bada.model.utils.UNE_RESSOURCE;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UNE_RESSOURCE_DAO extends MongoRepository<UNE_RESSOURCE, Integer> {

}

