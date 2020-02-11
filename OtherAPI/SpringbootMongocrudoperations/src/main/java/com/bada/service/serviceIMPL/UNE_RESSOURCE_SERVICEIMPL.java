package com.bada.service.serviceIMPL;



import com.bada.dao.UNE_RESSOURCE_DAO;
import com.bada.model.utils.UNE_RESSOURCE;
import com.bada.service.UNE_RESSOURCE_SERVICE;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
public class UNE_RESSOURCE_SERVICEIMPL implements UNE_RESSOURCE_SERVICE {

    @Autowired
    UNE_RESSOURCE_DAO dao;

    @Override
    public void createUNE_RESSOURCE(List<UNE_RESSOURCE> une_ressource) {
        dao.saveAll(une_ressource);
    }

    @Override
    public Collection<UNE_RESSOURCE> getAllUNE_RESSOURCE() {
        return dao.findAll();
    }

    @Override
    public Optional<UNE_RESSOURCE> findUNE_RESSOURCEById(int id) {
        return dao.findById(id);
    }

    @Override
    public void deleteUNE_RESSOURCEById(int id) {
        dao.deleteById(id);
    }

    @Override
    public void updateUNE_RESSOURCE(UNE_RESSOURCE une_ressource) {
        dao.save(une_ressource);
    }

    @Override
    public void deleteAllUNE_RESSOURCE() {
        dao.deleteAll();
    }
}


