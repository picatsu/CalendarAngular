package com.bada.dao;


import com.bada.model.UNE_SALLE;
import com.bada.model.UNE_SEANCE;
import com.bada.model.UN_CNU;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UNE_SEANCE_DAO extends MongoRepository<UNE_SEANCE, Integer> {
    Optional<UNE_SEANCE> findByCODE(String CODE);
    void deleteByCODE(String CODE);
}
