package com.bada.dao;

import com.bada.model.UNE_RESERVATION;
import com.bada.model.UN_CNU;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UNE_RESERVATION_DAO extends MongoRepository<UNE_RESERVATION, Integer> {

    Optional<UNE_RESERVATION> findByCODE(String CODE);

}
