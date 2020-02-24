package com.bada.service;




import com.bada.model.UNE_COMPOSANTE;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
public interface UNE_COMPOSANTE_SERVICE {

    public void createUNE_COMPOSANTE(List<UNE_COMPOSANTE> une_composante);
    public Collection<UNE_COMPOSANTE> getAllUNE_COMPOSANTE();
    public Optional<UNE_COMPOSANTE> findUNE_COMPOSANTEById(int id);
    public Optional<UNE_COMPOSANTE> findUNE_COMPOSANTEByCODE(String CODE);
    public void deleteUNE_COMPOSANTEById(int id);
    public void updateUNE_COMPOSANTE(UNE_COMPOSANTE une_composante);
    public void deleteAllUNE_COMPOSANTE();
}


