package com.bada.service;

import com.bada.model.utils.LES_CONGES;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface LES_CONGES_SERVICE {


    public void createLES_CONGES(List<LES_CONGES> les_conges);

    public Collection<LES_CONGES> getAllLES_CONGES();

    public Optional<LES_CONGES> findLES_CONGESById(int id);

    public void deleteLES_CONGESById(int id);

    public void updateLES_CONGES(LES_CONGES les_conges);

    public void deleteAllLES_CONGES();
}
