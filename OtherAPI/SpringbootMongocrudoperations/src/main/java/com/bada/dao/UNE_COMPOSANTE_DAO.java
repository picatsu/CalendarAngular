package com.bada.dao;

import com.bada.model.UNE_COMPOSANTE;
import com.bada.model.UN_CNU;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UNE_COMPOSANTE_DAO extends MongoRepository<UNE_COMPOSANTE, Integer> {
    Optional<UNE_COMPOSANTE> findById(String id);
    void deleteById(String id);
}
