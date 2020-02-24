package com.bada.service.serviceIMPL;




import com.bada.dao.UN_GROUPES_DAO;
import com.bada.model.UN_GROUPES;
import com.bada.service.UN_GROUPES_SERVICE;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
public class UN_GROUPES_SERVICEIMPL implements UN_GROUPES_SERVICE {

    @Autowired
    UN_GROUPES_DAO dao;

    @Override
    public void createUN_GROUPES(List<UN_GROUPES> un_groupes) {
        dao.saveAll(un_groupes);
    }

    @Override
    public Collection<UN_GROUPES> getAllUN_GROUPES() {
        return dao.findAll();
    }

    @Override
    public Optional<UN_GROUPES> findUN_GROUPESByCODE(String CODE) {

        return dao.findByCODE(CODE);
    }

    @Override
    public void deleteUN_GROUPESByCODE(String CODE) {
        dao.deleteByCODE(CODE);
    }

    @Override
    public void updateUN_GROUPES(UN_GROUPES un_groupes) {
        dao.save(un_groupes);
    }

    @Override
    public void deleteAllUN_GROUPES() {
        dao.deleteAll();
    }
}

