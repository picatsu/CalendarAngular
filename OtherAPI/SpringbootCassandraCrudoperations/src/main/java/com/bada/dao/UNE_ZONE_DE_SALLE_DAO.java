package com.bada.dao;


import com.bada.model.UNE_ZONE_DE_SALLE;
import com.bada.model.UN_CNU;
import com.bada.model.UN_GRADE;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UNE_ZONE_DE_SALLE_DAO extends MongoRepository<UNE_ZONE_DE_SALLE, Integer> {

    void deleteById(String id);
    Optional<UNE_ZONE_DE_SALLE> findById(String id);

}

