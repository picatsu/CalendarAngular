package com.bada.service;




import com.bada.model.UNE_SALLE;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface UNE_SALLE_SERVICE {

    public void createUNE_SALLE(List<UNE_SALLE> une_salle);
    public Collection<UNE_SALLE> getAllUNE_SALLE();
    public Optional<UNE_SALLE> findUNE_SALLEById(int id);
    public Optional<UNE_SALLE> findUNE_SALLEByCODE(String CODE);
    public void deleteUNE_SALLEById(int id);
    public void updateUNE_SALLE(UNE_SALLE une_salle);
    public void deleteAllUNE_SALLE();
}

