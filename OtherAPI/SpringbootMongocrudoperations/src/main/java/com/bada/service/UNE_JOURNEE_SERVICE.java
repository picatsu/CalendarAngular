package com.bada.service;





import com.bada.model.utils.UNE_JOURNEE;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
public interface UNE_JOURNEE_SERVICE {

    public void createUNE_JOURNEE(List<UNE_JOURNEE> une_journee);
    public Collection<UNE_JOURNEE> getAllUNE_JOURNEE();
    public Optional<UNE_JOURNEE> findUNE_JOURNEEById(int id);
    public void deleteUNE_JOURNEEById(int id);
    public void updateUNE_JOURNEE(UNE_JOURNEE une_journee);
    public void deleteAllUNE_JOURNEE();
}


