package com.bada.dao;

import com.bada.model.UN_CNU;
import com.bada.model.UN_ETUDIANT;
import com.bada.model.UN_GRADE;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UN_GRADE_DAO extends Neo4jRepository<UN_GRADE, Integer> {

    Optional<UN_GRADE> findById(String id);
    void deleteById(String id);

}
