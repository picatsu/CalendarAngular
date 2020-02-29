package com.bada.service.serviceIMPL;


import com.bada.dao.UNE_MATIERE_DAO;
import com.bada.model.UNE_MATIERE;
import com.bada.service.UNE_MATIERE_SERVICE;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
public class UNE_MATIERE_SERVICEIMPL implements UNE_MATIERE_SERVICE {

    @Autowired
    UNE_MATIERE_DAO dao;

    @Override
    public void createUNE_MATIERE(List<UNE_MATIERE> une_matiere) {
        dao.saveAll(une_matiere);
    }

    @Override
    public Collection<UNE_MATIERE> getAllUNE_MATIERE() {
        return dao.findAll();
    }


    @Override
    public Optional<UNE_MATIERE> findUNE_MATIEREById(String id) {

        return dao.findById(id);
    }

    @Override
    public void deleteUNE_MATIEREById(String id) {
        dao.deleteById(id);
    }

    @Override
    public void updateUNE_MATIERE(UNE_MATIERE une_matiere) {
        dao.save(une_matiere);
    }

    @Override
    public void deleteAllUNE_MATIERE() {
        dao.deleteAll();
    }
}

