package com.bada.service;




import com.bada.model.UNE_MATIERE;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface UNE_MATIERE_SERVICE {

    public void createUNE_MATIERE(List<UNE_MATIERE> une_matiere);
    public Collection<UNE_MATIERE> getAllUNE_MATIERE();
    public Optional<UNE_MATIERE> findUNE_MATIEREById(String id);
    public void deleteUNE_MATIEREById(String id);
    public void updateUNE_MATIERE(UNE_MATIERE une_matiere);
    public void deleteAllUNE_MATIERE();
}



