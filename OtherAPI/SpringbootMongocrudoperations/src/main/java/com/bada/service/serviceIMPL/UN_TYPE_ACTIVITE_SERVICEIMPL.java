package com.bada.service.serviceIMPL;

import com.bada.dao.UN_TYPE_ACTIVITE_DAO;
import com.bada.model.UN_TYPE_ACTIVITE;
import com.bada.service.UN_TYPE_ACTIVITE_SERVICE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;


@Service
public class UN_TYPE_ACTIVITE_SERVICEIMPL implements UN_TYPE_ACTIVITE_SERVICE {


    @Autowired
    UN_TYPE_ACTIVITE_DAO dao;

    @Override
    public void createUN_TYPE_ACTIVITE(List<UN_TYPE_ACTIVITE> UN_TYPE_ACTIVITE) {
        dao.saveAll(UN_TYPE_ACTIVITE);
    }

    @Override
    public Collection<UN_TYPE_ACTIVITE> getAllUN_TYPE_ACTIVITE() {
        return dao.findAll();
    }

    @Override
    public Optional<UN_TYPE_ACTIVITE> findUN_TYPE_ACTIVITEByCODE(String CODE) {
        return dao.findByCODE(CODE);
    }

    @Override
    public void deleteUN_TYPE_ACTIVITEByCODE(String CODE) {
        dao.deleteByCODE(CODE);
    }

    @Override
    public void updateUN_TYPE_ACTIVITE(UN_TYPE_ACTIVITE UN_TYPE_ACTIVITE) {
        dao.save(UN_TYPE_ACTIVITE);
    }

    @Override
    public void deleteAllUN_TYPE_ACTIVITE() {
        dao.deleteAll();
    }
}

