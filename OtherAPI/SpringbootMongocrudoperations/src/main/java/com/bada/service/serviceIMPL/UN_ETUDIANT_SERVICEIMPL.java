package com.bada.service.serviceIMPL;


import com.bada.dao.UN_ETUDIANT_DAO;
import com.bada.model.UN_ETUDIANT;
import com.bada.service.UN_ETUDIANT_SERVICE;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
public class UN_ETUDIANT_SERVICEIMPL implements UN_ETUDIANT_SERVICE {

    @Autowired
    UN_ETUDIANT_DAO dao;

    @Override
    public void createUN_ETUDIANT(List<UN_ETUDIANT> les_etudiant) {
        dao.saveAll(les_etudiant);
    }

    @Override
    public Collection<UN_ETUDIANT> getAllUN_ETUDIANT() {
        return dao.findAll();
    }

    @Override
    public Optional<UN_ETUDIANT> findUN_ETUDIANTById(int id) {
        return dao.findById(id);
    }

    @Override
    public void deleteUN_ETUDIANTById(int id) {
        dao.deleteById(id);
    }

    @Override
    public void updateUN_ETUDIANT(UN_ETUDIANT les_etudiant) {
        dao.save(les_etudiant);
    }

    @Override
    public void deleteAllUN_ETUDIANT() {
        dao.deleteAll();
    }
}

