package com.bada.dao;


import com.bada.model.UNE_SALLE;
import com.bada.model.UN_CNU;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UNE_SALLE_DAO extends MongoRepository<UNE_SALLE, Integer> {

    Optional<UNE_SALLE> findByCODE(String CODE);

}

