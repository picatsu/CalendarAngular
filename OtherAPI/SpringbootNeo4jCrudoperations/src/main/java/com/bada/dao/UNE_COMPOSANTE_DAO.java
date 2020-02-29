package com.bada.dao;

import com.bada.model.UNE_COMPOSANTE;
import com.bada.model.UN_CNU;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UNE_COMPOSANTE_DAO extends Neo4jRepository<UNE_COMPOSANTE, Integer> {
    Optional<UNE_COMPOSANTE> findById(String id);
    void deleteById(String id);
}
