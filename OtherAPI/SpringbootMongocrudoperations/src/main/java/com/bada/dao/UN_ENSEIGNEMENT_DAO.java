package com.bada.dao;


import com.bada.model.UN_ENSEIGNEMENT;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UN_ENSEIGNEMENT_DAO extends MongoRepository<UN_ENSEIGNEMENT, Integer> {

}
