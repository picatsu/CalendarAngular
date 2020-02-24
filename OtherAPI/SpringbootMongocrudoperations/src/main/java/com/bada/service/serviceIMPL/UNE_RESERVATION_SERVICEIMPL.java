package com.bada.service.serviceIMPL;





import com.bada.dao.UNE_RESERVATION_DAO;
import com.bada.model.UNE_RESERVATION;
import com.bada.service.UNE_RESERVATION_SERVICE;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
public class UNE_RESERVATION_SERVICEIMPL implements UNE_RESERVATION_SERVICE {

    @Autowired
    UNE_RESERVATION_DAO dao;

    @Override
    public void createUNE_RESERVATION(List<UNE_RESERVATION> une_reservation) {
        dao.saveAll(une_reservation);
    }

    @Override
    public Collection<UNE_RESERVATION> getAllUNE_RESERVATION() {
        return dao.findAll();
    }

    @Override
    public Optional<UNE_RESERVATION> findUNE_RESERVATIONByCODE(String CODE)
    {
        return dao.findByCODE(CODE);
    }

    @Override
    public void deleteUNE_RESERVATIONByCODE(String CODE) {
        dao.deleteByCODE(CODE);
    }

    @Override
    public void updateUNE_RESERVATION(UNE_RESERVATION une_reservation) {
        dao.save(une_reservation);
    }

    @Override
    public void deleteAllUNE_RESERVATION() {
        dao.deleteAll();
    }
}
