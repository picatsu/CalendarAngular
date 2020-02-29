package com.bada.service;

import com.bada.model.SAUVEGARDE;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface SAUVEGARDE_SERVICE {

    public void createSAUVEGARDE(List<SAUVEGARDE> sauvegarde);
    public Collection<SAUVEGARDE> getAllSAUVEGARDE();
    public Optional<SAUVEGARDE> findSAUVEGARDEByDATE(String DATE);
    public void deleteSAUVEGARDEByDATE(String DATE);
    public Optional<SAUVEGARDE> findSAUVEGARDEByUTILISATEUR(String UTILISATEUR);
    public void deleteSAUVEGARDEByUTILISATEUR(String UTILISATEUR);
    public void updateSAUVEGARDE(SAUVEGARDE sauvegarde);
    public void deleteAllSAUVEGARDES();
}
