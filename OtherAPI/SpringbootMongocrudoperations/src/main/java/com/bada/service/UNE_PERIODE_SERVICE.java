package com.bada.service;



import com.bada.model.UNE_PERIODE;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
public interface UNE_PERIODE_SERVICE {

    public void createUNE_PERIODE(List<UNE_PERIODE> une_periode);
    public Collection<UNE_PERIODE> getAllUNE_PERIODE();
    public Optional<UNE_PERIODE> findUNE_PERIODEById(int id);
    public void deleteUNE_PERIODEById(int id);
    public void updateUNE_PERIODE(UNE_PERIODE une_periode);
    public void deleteAllUNE_PERIODE();
}



