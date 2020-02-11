package com.bada.service.serviceIMPL;




import com.bada.dao.UN_PROFESSEUR_DAO;
import com.bada.model.UN_PROFESSEUR;
import com.bada.service.UN_PROFESSEUR_SERVICE;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
public class UN_PROFESSEUR_SERVICEIMPL implements UN_PROFESSEUR_SERVICE {

    @Autowired
    UN_PROFESSEUR_DAO dao;

    @Override
    public void createUN_PROFESSEUR(List<UN_PROFESSEUR> un_professeur) {
        dao.saveAll(un_professeur);
    }

    @Override
    public Collection<UN_PROFESSEUR> getAllUN_PROFESSEUR() {
        return dao.findAll();
    }

    @Override
    public Optional<UN_PROFESSEUR> findUN_PROFESSEURById(int id) {
        return dao.findById(id);
    }

    @Override
    public void deleteUN_PROFESSEURById(int id) {
        dao.deleteById(id);
    }

    @Override
    public void updateUN_PROFESSEUR(UN_PROFESSEUR un_professeur) {
        dao.save(un_professeur);
    }

    @Override
    public void deleteAllUN_PROFESSEUR() {
        dao.deleteAll();
    }
}




