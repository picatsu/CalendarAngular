package com.bada.service.serviceIMPL;





import com.bada.dao.UNE_COMPOSANTE_DAO;
import com.bada.model.UNE_COMPOSANTE;
import com.bada.service.UNE_COMPOSANTE_SERVICE;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
public class UNE_COMPOSANTE_SERVICEIMPL implements UNE_COMPOSANTE_SERVICE {

    @Autowired
    UNE_COMPOSANTE_DAO dao;

    @Override
    public void createUNE_COMPOSANTE(List<UNE_COMPOSANTE> une_composante) {
        dao.saveAll(une_composante);
    }

    @Override
    public Collection<UNE_COMPOSANTE> getAllUNE_COMPOSANTE() {
        return (Collection<UNE_COMPOSANTE>) dao.findAll();
    }

    @Override
    public Optional<UNE_COMPOSANTE> findUNE_COMPOSANTEById(String id) {
        return dao.findById(id);
    }

    @Override
    public void deleteUNE_COMPOSANTEById(String id) {
        dao.deleteById(id);
    }

    @Override
    public void updateUNE_COMPOSANTE(UNE_COMPOSANTE une_composante) {
        dao.save(une_composante);
    }

    @Override
    public void deleteAllUNE_COMPOSANTE() {
        dao.deleteAll();
    }
}


