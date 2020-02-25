package com.bada.dao;

import com.bada.model.UNE_MATIERE;
import com.bada.model.UN_CNU;
import com.bada.model.UN_GRADE;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UNE_MATIERE_DAO extends MongoRepository<UNE_MATIERE, Integer> {

    void deleteById(String id);
    Optional<UNE_MATIERE> findById(String id);

}
