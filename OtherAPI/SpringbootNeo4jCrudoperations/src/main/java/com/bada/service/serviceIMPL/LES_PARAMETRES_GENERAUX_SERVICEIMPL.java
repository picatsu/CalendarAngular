package com.bada.service.serviceIMPL;

import com.bada.dao.LES_PARAMETRES_GENERAUX_DAO;
import com.bada.dao.SAUVEGARDEDAO;
import com.bada.model.LES_PARAMETRES_GENERAUX;
import com.bada.model.SAUVEGARDE;
import com.bada.service.LES_PARAMETRES_GENERAUX_SERVICE;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class LES_PARAMETRES_GENERAUX_SERVICEIMPL implements LES_PARAMETRES_GENERAUX_SERVICE {


    @Autowired
    LES_PARAMETRES_GENERAUX_DAO dao;

    @Override
    public void createLES_PARAMETRES_GENERAUX(List<LES_PARAMETRES_GENERAUX> les_parametres_generauxes) {
        dao.saveAll(les_parametres_generauxes);
    }

    @Override
    public Collection<LES_PARAMETRES_GENERAUX> getAllLES_PARAMETRES_GENERAUX() {

        return (Collection<LES_PARAMETRES_GENERAUX>) dao.findAll();
    }

    @Override
    public Optional<LES_PARAMETRES_GENERAUX> findLES_PARAMETRES_GENERAUXById(int id) {
        return dao.findById(id);
    }

    @Override
    public void deleteLES_PARAMETRES_GENERAUXById(int id) {
        dao.deleteById(id);
    }

    @Override
    public void updateLES_PARAMETRES_GENERAUX(LES_PARAMETRES_GENERAUX les_parametres_generauxes) {
        dao.save(les_parametres_generauxes);
    }

    @Override
    public void deleteAllLES_PARAMETRES_GENERAUX() {
        dao.deleteAll();
    }



}
