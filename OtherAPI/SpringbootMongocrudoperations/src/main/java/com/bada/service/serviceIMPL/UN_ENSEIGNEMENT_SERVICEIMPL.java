package com.bada.service.serviceIMPL;


import com.bada.dao.UN_ENSEIGNEMENT_DAO;
import com.bada.model.UN_ENSEIGNEMENT;
import com.bada.service.UN_ENSEIGNEMENT_SERVICE;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
public class UN_ENSEIGNEMENT_SERVICEIMPL implements UN_ENSEIGNEMENT_SERVICE {

    @Autowired
    UN_ENSEIGNEMENT_DAO dao;

    @Override
    public void createUN_ENSEIGNEMENT(List<UN_ENSEIGNEMENT> un_enseignement) {
        dao.saveAll(un_enseignement);
    }

    @Override
    public Collection<UN_ENSEIGNEMENT> getAllUN_ENSEIGNEMENT() {
        return dao.findAll();
    }

    @Override
    public Optional<UN_ENSEIGNEMENT> findUN_ENSEIGNEMENTById(int id) {
        return dao.findById(id);
    }

    @Override
    public void deleteUN_ENSEIGNEMENTById(int id) {
        dao.deleteById(id);
    }

    @Override
    public void updateUN_ENSEIGNEMENT(UN_ENSEIGNEMENT un_enseignement) {
        dao.save(un_enseignement);
    }

    @Override
    public void deleteAllUN_ENSEIGNEMENT() {
        dao.deleteAll();
    }
}
