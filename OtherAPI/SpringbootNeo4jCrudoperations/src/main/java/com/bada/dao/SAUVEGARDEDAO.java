package com.bada.dao;

import com.bada.model.SAUVEGARDE;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface SAUVEGARDEDAO extends Neo4jRepository<SAUVEGARDE, Integer> {

    Optional<SAUVEGARDE> findByUTILISATEUR(String UTILISATEUR);
    Optional<SAUVEGARDE> findByDATE(String DATE);
    void deleteByUTILISATEUR(String UTILISATEUR);
    void deleteByDATE(String DATE);
}
