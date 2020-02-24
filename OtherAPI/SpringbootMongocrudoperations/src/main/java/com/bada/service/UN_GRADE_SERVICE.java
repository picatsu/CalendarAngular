package com.bada.service;



import com.bada.model.UN_GRADE;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
public interface UN_GRADE_SERVICE {

    public void createUN_GRADE(List<UN_GRADE> un_grade);
    public Collection<UN_GRADE> getAllUN_GRADE();
    public Optional<UN_GRADE> findUN_GRADEById(int id);
    public Optional<UN_GRADE> findUN_GRADEByCODE(String CODE);

    public void deleteUN_GRADEById(int id);
    public void updateUN_GRADE(UN_GRADE un_grade);
    public void deleteAllUN_GRADE();
}
