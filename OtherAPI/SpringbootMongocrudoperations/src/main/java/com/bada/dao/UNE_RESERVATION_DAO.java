package com.bada.dao;

import com.bada.model.UNE_RESERVATION;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UNE_RESERVATION_DAO extends MongoRepository<UNE_RESERVATION, Integer> {

}
