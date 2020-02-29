package com.bada.service.serviceIMPL;

import com.bada.dao.SAUVEGARDEDAO;
import com.bada.model.SAUVEGARDE;
import com.bada.service.SAUVEGARDE_SERVICE;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class SAUVEGARDE_SERVICEIMPL implements SAUVEGARDE_SERVICE {

    @Autowired
    SAUVEGARDEDAO dao;

    @Override
    public void createSAUVEGARDE(List<SAUVEGARDE> sauvegarde) {
        dao.saveAll(sauvegarde);
    }

    @Override
    public Collection<SAUVEGARDE> getAllSAUVEGARDE() {
        return
                (Collection<SAUVEGARDE>) dao.findAll();
    }

    @Override
    public void updateSAUVEGARDE(SAUVEGARDE sauvegarde) {
        dao.save(sauvegarde);
    }

    @Override
    public void deleteAllSAUVEGARDES() {
        dao.deleteAll();
    }


    @Override
    public Optional<SAUVEGARDE> findSAUVEGARDEByUTILISATEUR(String UTILISATEUR) {
        return dao.findByUTILISATEUR(UTILISATEUR);
    }
    @Override
    public void deleteSAUVEGARDEByUTILISATEUR(String UTILISATEUR) {
        dao.deleteByUTILISATEUR(UTILISATEUR);
    }

    @Override
    public Optional<SAUVEGARDE> findSAUVEGARDEByDATE(String DATE) {
        return dao.findByDATE(DATE);
    }
    @Override
    public void deleteSAUVEGARDEByDATE(String DATE) {
        dao.deleteByDATE(DATE);
    }

}
