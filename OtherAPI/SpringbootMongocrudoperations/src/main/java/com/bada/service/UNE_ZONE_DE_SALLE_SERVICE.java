package com.bada.service;



import com.bada.model.UNE_ZONE_DE_SALLE;

import java.util.Collection;
import java.util.List;
import java.util.Optional;


public interface UNE_ZONE_DE_SALLE_SERVICE {

    public void createUNE_ZONE_DE_SALLE(List<UNE_ZONE_DE_SALLE> une_zone_de_salle);
    public Collection<UNE_ZONE_DE_SALLE> getAllUNE_ZONE_DE_SALLE();
    public Optional<UNE_ZONE_DE_SALLE> findUNE_ZONE_DE_SALLEById(int id);
    public void deleteUNE_ZONE_DE_SALLEById(int id);
    public void updateUNE_ZONE_DE_SALLE(UNE_ZONE_DE_SALLE une_zone_de_salle);
    public void deleteAllUNE_ZONE_DE_SALLE();
}
