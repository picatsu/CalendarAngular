package com.bada.dao;

import com.bada.model.UNE_RESERVATION;
import com.bada.model.UN_CNU;
import com.bada.model.UN_GRADE;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UNE_RESERVATION_DAO extends Neo4jRepository<UNE_RESERVATION, Integer> {

    void deleteById(String id);
    Optional<UNE_RESERVATION> findById(String id);

}
