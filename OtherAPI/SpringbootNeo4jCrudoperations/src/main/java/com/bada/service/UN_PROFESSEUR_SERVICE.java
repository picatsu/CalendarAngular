package com.bada.service;

import com.bada.model.UN_CNU;
import com.bada.model.UN_PROFESSEUR;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
public interface UN_PROFESSEUR_SERVICE {

    public void createUN_PROFESSEUR(List<UN_PROFESSEUR> un_professeur);
    public Collection<UN_PROFESSEUR> getAllUN_PROFESSEUR();
    public Optional<UN_PROFESSEUR> findUN_PROFESSEURById(String id);
    public void deleteUN_PROFESSEURById(String id);
    public void updateUN_PROFESSEUR(UN_PROFESSEUR un_professeur);
    public void deleteAllUN_PROFESSEUR();
}
