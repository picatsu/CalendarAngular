package com.bada.service;


import com.bada.model.UN_ENSEIGNEMENT;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface UN_ENSEIGNEMENT_SERVICE {

    public void createUN_ENSEIGNEMENT(List<UN_ENSEIGNEMENT> un_enseignement);
    public Collection<UN_ENSEIGNEMENT> getAllUN_ENSEIGNEMENT();
    public Optional<UN_ENSEIGNEMENT> findUN_ENSEIGNEMENTById(int id);
    public void deleteUN_ENSEIGNEMENTById(int id);
    public void updateUN_ENSEIGNEMENT(UN_ENSEIGNEMENT un_enseignement);
    public void deleteAllUN_ENSEIGNEMENT();
}
