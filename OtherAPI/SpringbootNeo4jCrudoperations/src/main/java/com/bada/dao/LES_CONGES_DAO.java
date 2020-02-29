package com.bada.dao;

import com.bada.model.utils.LES_CONGES;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LES_CONGES_DAO extends Neo4jRepository<LES_CONGES, Integer> {

}
