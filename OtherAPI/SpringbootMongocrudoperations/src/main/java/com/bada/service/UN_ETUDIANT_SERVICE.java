package com.bada.service;


import com.bada.model.UN_ETUDIANT;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface UN_ETUDIANT_SERVICE {

    public void createUN_ETUDIANT(List<UN_ETUDIANT> une_etudiant);
    public Collection<UN_ETUDIANT> getAllUN_ETUDIANT();
    public Optional<UN_ETUDIANT> findUN_ETUDIANTById(int id);
    public void deleteUN_ETUDIANTById(int id);
    public void updateUN_ETUDIANT(UN_ETUDIANT un_etudiant);
    public void deleteAllUN_ETUDIANT();
}
