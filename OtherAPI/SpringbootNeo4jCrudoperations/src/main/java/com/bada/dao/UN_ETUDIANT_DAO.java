package com.bada.dao;

import com.bada.model.UN_CNU;
import com.bada.model.UN_ENSEIGNEMENT;
import com.bada.model.UN_ETUDIANT;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UN_ETUDIANT_DAO extends Neo4jRepository<UN_ETUDIANT, Integer> {

    Optional<UN_ETUDIANT> findById(String id);
    void deleteById(String id);
}
