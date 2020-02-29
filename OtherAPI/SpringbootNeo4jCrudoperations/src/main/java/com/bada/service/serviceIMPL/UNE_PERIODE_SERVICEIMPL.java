package com.bada.service.serviceIMPL;

import com.bada.dao.UNE_PERIODE_DAO;
import com.bada.model.UNE_PERIODE;
import com.bada.service.UNE_PERIODE_SERVICE;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
public class UNE_PERIODE_SERVICEIMPL implements UNE_PERIODE_SERVICE {

    @Autowired
    UNE_PERIODE_DAO dao;

    @Override
    public void createUNE_PERIODE(List<UNE_PERIODE> une_periode) {
        dao.saveAll(une_periode);
    }

    @Override
    public Collection<UNE_PERIODE> getAllUNE_PERIODE() {
        return dao.findAll();
    }

    @Override
    public Optional<UNE_PERIODE> findUNE_PERIODEById(int id) {
        return dao.findById(id);
    }

    @Override
    public void deleteUNE_PERIODEById(int id) {
        dao.deleteById(id);
    }

    @Override
    public void updateUNE_PERIODE(UNE_PERIODE une_periode) {
        dao.save(une_periode);
    }

    @Override
    public void deleteAllUNE_PERIODE() {
        dao.deleteAll();
    }
}



