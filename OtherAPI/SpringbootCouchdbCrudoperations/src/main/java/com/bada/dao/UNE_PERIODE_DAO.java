package com.bada.dao;

import com.bada.model.UNE_PERIODE;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UNE_PERIODE_DAO extends MongoRepository<UNE_PERIODE, Integer> {

}
