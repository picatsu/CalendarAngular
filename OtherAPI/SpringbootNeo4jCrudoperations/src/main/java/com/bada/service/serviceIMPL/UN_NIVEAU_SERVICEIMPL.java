package com.bada.service.serviceIMPL;





import com.bada.dao.UN_NIVEAU_DAO;
import com.bada.model.UN_NIVEAU;
import com.bada.service.UN_NIVEAU_SERVICE;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
public class UN_NIVEAU_SERVICEIMPL implements UN_NIVEAU_SERVICE {

    @Autowired
    UN_NIVEAU_DAO dao;

    @Override
    public void createUN_NIVEAU(List<UN_NIVEAU> un_niveau) {
        dao.saveAll(un_niveau);
    }

    @Override
    public Collection<UN_NIVEAU> getAllUN_NIVEAU() {
        return (Collection<UN_NIVEAU>) dao.findAll();
    }


    @Override
    public Optional<UN_NIVEAU> findUN_NIVEAUById(String id)
    {
        return dao.findById(id);
    }


    @Override
    public void deleteUN_NIVEAUById(String id) {
        dao.deleteById(id);
    }

    @Override
    public void updateUN_NIVEAU(UN_NIVEAU un_niveau) {
        dao.save(un_niveau);
    }

    @Override
    public void deleteAllUN_NIVEAU() {
        dao.deleteAll();
    }
}
