package com.bada.service.serviceIMPL;





import com.bada.dao.UNE_JOURNEE_DAO;
import com.bada.model.utils.UNE_JOURNEE;
import com.bada.service.UNE_JOURNEE_SERVICE;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
public class UNE_JOURNEE_SERVICEIMPL implements UNE_JOURNEE_SERVICE {

    @Autowired
    UNE_JOURNEE_DAO dao;

    @Override
    public void createUNE_JOURNEE(List<UNE_JOURNEE> une_journee) {
        dao.saveAll(une_journee);
    }

    @Override
    public Collection<UNE_JOURNEE> getAllUNE_JOURNEE() {
        return dao.findAll();
    }

    @Override
    public Optional<UNE_JOURNEE> findUNE_JOURNEEById(int id) {
        return dao.findById(id);
    }

    @Override
    public void deleteUNE_JOURNEEById(int id) {
        dao.deleteById(id);
    }

    @Override
    public void updateUNE_JOURNEE(UNE_JOURNEE une_journee) {
        dao.save(une_journee);
    }

    @Override
    public void deleteAllUNE_JOURNEE() {
        dao.deleteAll();
    }
}


