package com.bada.service;

import com.bada.model.SAUVEGARDE;
import com.bada.model.UN_CNU;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface UN_CNU_SERVICE {

    public void createUN_CNU(List<UN_CNU> un_cnu);
    public Collection<UN_CNU> getAllUN_CNU();
    public Optional<UN_CNU> findUN_CNUByCODE(String CODE);
    public void deleteUN_CNUByCODE(String CODE);
    public void updateUN_CNU(UN_CNU un_cnu);
    public void deleteAllUN_CNU();


}
