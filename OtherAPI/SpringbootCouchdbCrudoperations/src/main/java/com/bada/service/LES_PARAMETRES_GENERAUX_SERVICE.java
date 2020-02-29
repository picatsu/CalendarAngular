package com.bada.service;

import com.bada.model.LES_PARAMETRES_GENERAUX;
import com.bada.model.SAUVEGARDE;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface LES_PARAMETRES_GENERAUX_SERVICE {


    public void createLES_PARAMETRES_GENERAUX(List<LES_PARAMETRES_GENERAUX> les_parametres_generauxes);
    public Collection<LES_PARAMETRES_GENERAUX> getAllLES_PARAMETRES_GENERAUX();
    public Optional<LES_PARAMETRES_GENERAUX> findLES_PARAMETRES_GENERAUXById(int id);
    public void deleteLES_PARAMETRES_GENERAUXById(int id);
    public void updateLES_PARAMETRES_GENERAUX(LES_PARAMETRES_GENERAUX les_parametres_generauxes);
    public void deleteAllLES_PARAMETRES_GENERAUX();


}
