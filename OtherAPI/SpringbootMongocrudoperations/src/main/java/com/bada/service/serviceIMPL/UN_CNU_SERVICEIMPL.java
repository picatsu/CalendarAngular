package com.bada.service.serviceIMPL;

import com.bada.dao.UN_CNU_DAO;
import com.bada.model.UN_CNU;
import com.bada.service.UN_CNU_SERVICE;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class UN_CNU_SERVICEIMPL implements UN_CNU_SERVICE {

    @Autowired
    UN_CNU_DAO dao;

    @Override
    public void createUN_CNU(List<UN_CNU> un_cnu) {
        dao.saveAll(un_cnu);
    }

    @Override
    public Collection<UN_CNU> getAllUN_CNU() {
        return dao.findAll();
    }

    @Override
    public Optional<UN_CNU> findUN_CNUById(int id) {
        return dao.findById(id);
    }

    @Override
    public Optional<UN_CNU> findUN_CNUByCODE(String CODE) {
        return dao.findByCODE(CODE);
    }


    @Override
    public void deleteUN_CNUById(int id) {
        dao.deleteById(id);
    }

    @Override
    public void updateUN_CNU(UN_CNU un_cnu) {
        dao.save(un_cnu);
    }

    @Override
    public void deleteAllUN_CNU() {
        dao.deleteAll();
    }
}
