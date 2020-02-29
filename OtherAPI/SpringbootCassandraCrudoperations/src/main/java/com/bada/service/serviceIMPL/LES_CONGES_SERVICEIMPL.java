package com.bada.service.serviceIMPL;

import com.bada.dao.LES_CONGES_DAO;
import com.bada.model.utils.LES_CONGES;
import com.bada.service.LES_CONGES_SERVICE;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
public class LES_CONGES_SERVICEIMPL implements LES_CONGES_SERVICE {

    @Autowired
    LES_CONGES_DAO dao;

    @Override
    public void createLES_CONGES(List<LES_CONGES> les_conges) {
        dao.saveAll(les_conges);
    }

    @Override
    public Collection<LES_CONGES> getAllLES_CONGES() {
        return dao.findAll();
    }

    @Override
    public Optional<LES_CONGES> findLES_CONGESById(int id) {
        return dao.findById(id);
    }

    @Override
    public void deleteLES_CONGESById(int id) {
        dao.deleteById(id);
    }

    @Override
    public void updateLES_CONGES(LES_CONGES les_conges) {
        dao.save(les_conges);
    }

    @Override
    public void deleteAllLES_CONGES() {
        dao.deleteAll();
    }
}
