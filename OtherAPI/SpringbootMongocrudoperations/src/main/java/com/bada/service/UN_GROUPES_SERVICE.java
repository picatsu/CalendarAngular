package com.bada.service;

import com.bada.model.UN_GROUPES;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
public interface UN_GROUPES_SERVICE {

    public void createUN_GROUPES(List<UN_GROUPES> un_groupe);
    public Collection<UN_GROUPES> getAllUN_GROUPES();
    public Optional<UN_GROUPES> findUN_GROUPESById(String id);

    public void deleteUN_GROUPESById(String id);
    public void updateUN_GROUPES(UN_GROUPES un_groupe);
    public void deleteAllUN_GROUPES();
}
