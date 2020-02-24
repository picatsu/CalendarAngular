package com.bada.dao;

import com.bada.model.SAUVEGARDE;
import com.bada.model.UN_CNU;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UN_CNU_DAO extends MongoRepository<UN_CNU, Integer> {

    Optional<UN_CNU> findByCODE(String CODE);
    void deleteByCODE(String CODE);
}
