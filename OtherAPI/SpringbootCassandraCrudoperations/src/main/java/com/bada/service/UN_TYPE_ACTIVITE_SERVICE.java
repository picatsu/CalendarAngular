package com.bada.service;

import com.bada.model.UN_TYPE_ACTIVITE;
import org.springframework.context.annotation.Bean;

import java.util.Collection;
import java.util.List;
import java.util.Optional;



public interface UN_TYPE_ACTIVITE_SERVICE {

    public void createUN_TYPE_ACTIVITE(List<UN_TYPE_ACTIVITE> UN_TYPE_ACTIVITE);
    public Collection<UN_TYPE_ACTIVITE> getAllUN_TYPE_ACTIVITE();
    public Optional<UN_TYPE_ACTIVITE> findUN_TYPE_ACTIVITEById(String id);
    public void deleteUN_TYPE_ACTIVITEById(String id);
    public void updateUN_TYPE_ACTIVITE(UN_TYPE_ACTIVITE UN_TYPE_ACTIVITE);
    public void deleteAllUN_TYPE_ACTIVITE();
}
