package com.bada.service.serviceIMPL;



import com.bada.dao.UN_GRADE_DAO;
import com.bada.model.UN_GRADE;
import com.bada.service.UN_GRADE_SERVICE;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
public class UN_GRADE_SERVICEIMPL implements UN_GRADE_SERVICE {

    @Autowired
    UN_GRADE_DAO dao;

    @Override
    public void createUN_GRADE(List<UN_GRADE> un_grade) {
        dao.saveAll(un_grade);
    }

    @Override
    public Collection<UN_GRADE> getAllUN_GRADE() {
        return (Collection<UN_GRADE>) dao.findAll();
    }


    @Override
    public Optional<UN_GRADE> findUN_GRADEById(String id) {
        return dao.findById(id);
    }


    @Override
    public void deleteUN_GRADEById(String id) {
        dao.deleteById(id);
    }

    @Override
    public void updateUN_GRADE(UN_GRADE un_grade) {
        dao.save(un_grade);
    }

    @Override
    public void deleteAllUN_GRADE() {
        dao.deleteAll();
    }
}

