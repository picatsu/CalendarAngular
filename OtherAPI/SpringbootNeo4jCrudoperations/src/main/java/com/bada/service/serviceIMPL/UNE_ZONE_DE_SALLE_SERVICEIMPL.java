package com.bada.service.serviceIMPL;


import com.bada.dao.UNE_ZONE_DE_SALLE_DAO;
import com.bada.model.UNE_ZONE_DE_SALLE;
import com.bada.service.UNE_ZONE_DE_SALLE_SERVICE;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
public class UNE_ZONE_DE_SALLE_SERVICEIMPL implements UNE_ZONE_DE_SALLE_SERVICE {

    @Autowired
    UNE_ZONE_DE_SALLE_DAO dao;

    @Override
    public void createUNE_ZONE_DE_SALLE(List<UNE_ZONE_DE_SALLE> une_zone_de_salle) {
        dao.saveAll(une_zone_de_salle);
    }

    @Override
    public Collection<UNE_ZONE_DE_SALLE> getAllUNE_ZONE_DE_SALLE() {
        return (Collection<UNE_ZONE_DE_SALLE>) dao.findAll();
    }


    @Override
    public Optional<UNE_ZONE_DE_SALLE> findUNE_ZONE_DE_SALLEById(String id) {
        return dao.findById(id);
    }

    @Override
    public void deleteUNE_ZONE_DE_SALLEById(String id) {
        dao.deleteById(id);
    }

    @Override
    public void updateUNE_ZONE_DE_SALLE(UNE_ZONE_DE_SALLE une_zone_de_salle) {
        dao.save(une_zone_de_salle);
    }

    @Override
    public void deleteAllUNE_ZONE_DE_SALLE() {
        dao.deleteAll();
    }
}
