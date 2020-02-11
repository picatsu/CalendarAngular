package com.bada.dao;

import com.bada.model.LES_PARAMETRES_GENERAUX;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LES_PARAMETRES_GENERAUX_DAO  extends MongoRepository<LES_PARAMETRES_GENERAUX, Integer> {

}
