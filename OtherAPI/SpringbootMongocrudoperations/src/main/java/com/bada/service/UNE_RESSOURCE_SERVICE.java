package com.bada.service;





import com.bada.model.utils.UNE_RESSOURCE;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface UNE_RESSOURCE_SERVICE {

    public void createUNE_RESSOURCE(List<UNE_RESSOURCE> une_ressource);
    public Collection<UNE_RESSOURCE> getAllUNE_RESSOURCE();
    public Optional<UNE_RESSOURCE> findUNE_RESSOURCEById(int id);
    public void deleteUNE_RESSOURCEById(int id);
    public void updateUNE_RESSOURCE(UNE_RESSOURCE une_ressource);
    public void deleteAllUNE_RESSOURCE();
}



