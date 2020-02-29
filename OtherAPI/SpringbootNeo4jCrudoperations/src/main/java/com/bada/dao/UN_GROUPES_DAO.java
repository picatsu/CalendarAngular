package com.bada.dao;

import com.bada.model.UN_CNU;
import com.bada.model.UN_GRADE;
import com.bada.model.UN_GROUPES;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UN_GROUPES_DAO extends Neo4jRepository<UN_GROUPES, Integer> {

    void deleteById(String id);
    Optional<UN_GROUPES> findById(String id);


}
