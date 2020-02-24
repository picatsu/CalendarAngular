package com.bada.service;



import com.bada.model.UN_NIVEAU;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
public interface UN_NIVEAU_SERVICE {

    public void createUN_NIVEAU(List<UN_NIVEAU> un_niveau);
    public Collection<UN_NIVEAU> getAllUN_NIVEAU();
    public Optional<UN_NIVEAU> findUN_NIVEAUById(int id);
    public Optional<UN_NIVEAU> findUN_NIVEAUByCODE(String CODE);
    public void deleteUN_NIVEAUById(int id);
    public void updateUN_NIVEAU(UN_NIVEAU un_niveau);
    public void deleteAllUN_NIVEAU();
}

