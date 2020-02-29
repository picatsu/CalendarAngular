package com.bada.dao;

import com.bada.model.utils.UNE_JOURNEE;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UNE_JOURNEE_DAO extends MongoRepository<UNE_JOURNEE, Integer> {

}
