package com.bada.service;





import com.bada.model.UNE_SEANCE;

import java.util.Collection;
import java.util.List;
import java.util.Optional;


public interface UNE_SEANCE_SERVICE {

    public void createUNE_SEANCE(List<UNE_SEANCE> une_seance);
    public Collection<UNE_SEANCE> getAllUNE_SEANCE();
    public Optional<UNE_SEANCE> findUNE_SEANCEByCODE(String CODE);
    public void deleteUNE_SEANCEByCODE(String CODE);
    public void updateUNE_SEANCE(UNE_SEANCE une_seance);
    public void deleteAllUNE_SEANCE();
}


