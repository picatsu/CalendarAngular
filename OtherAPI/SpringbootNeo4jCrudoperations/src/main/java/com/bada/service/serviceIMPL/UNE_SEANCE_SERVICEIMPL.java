package com.bada.service.serviceIMPL;

import com.bada.dao.UNE_SEANCE_DAO;
import com.bada.model.UNE_SEANCE;
import com.bada.service.UNE_SEANCE_SERVICE;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
public class UNE_SEANCE_SERVICEIMPL implements UNE_SEANCE_SERVICE {

    @Autowired
    UNE_SEANCE_DAO dao;

    @Override
    public void createUNE_SEANCE(List<UNE_SEANCE> une_seance) {
        dao.saveAll(une_seance);
    }

    @Override
    public Collection<UNE_SEANCE> getAllUNE_SEANCE() {
        return (Collection<UNE_SEANCE>) dao.findAll();
    }

    @Override
    public Optional<UNE_SEANCE> findUNE_SEANCEById(String id)
    {
        return dao.findById(id);
    }


    @Override
    public void deleteUNE_SEANCEById(String id) {
        dao.deleteById(id);
    }

    @Override
    public void updateUNE_SEANCE(UNE_SEANCE une_seance) {
        dao.save(une_seance);
    }

    @Override
    public void deleteAllUNE_SEANCE() {
        dao.deleteAll();
    }
}

