package com.bada.service.serviceIMPL;


import com.bada.dao.UNE_SALLE_DAO;
import com.bada.model.UNE_SALLE;
import com.bada.service.UNE_SALLE_SERVICE;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
public class UNE_SALLE_SERVICEIMPL implements UNE_SALLE_SERVICE {

    @Autowired
    UNE_SALLE_DAO dao;

    @Override
    public void createUNE_SALLE(List<UNE_SALLE> une_salle) {
        dao.saveAll(une_salle);
    }

    @Override
    public Collection<UNE_SALLE> getAllUNE_SALLE() {
        return dao.findAll();
    }

    @Override
    public Optional<UNE_SALLE> findUNE_SALLEById(int id) {
        return dao.findById(id);
    }

    @Override
    public void deleteUNE_SALLEById(int id) {
        dao.deleteById(id);
    }

    @Override
    public void updateUNE_SALLE(UNE_SALLE une_salle) {
        dao.save(une_salle);
    }

    @Override
    public void deleteAllUNE_SALLE() {
        dao.deleteAll();
    }
}
