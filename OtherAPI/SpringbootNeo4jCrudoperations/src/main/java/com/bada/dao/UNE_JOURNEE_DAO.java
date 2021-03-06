package com.bada.dao;

import com.bada.model.utils.UNE_JOURNEE;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UNE_JOURNEE_DAO extends Neo4jRepository<UNE_JOURNEE, Integer> {

}
