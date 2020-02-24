package com.bada.service;





import com.bada.model.UNE_RESERVATION;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface UNE_RESERVATION_SERVICE {

    public void createUNE_RESERVATION(List<UNE_RESERVATION> une_reservation);
    public Collection<UNE_RESERVATION> getAllUNE_RESERVATION();
    public Optional<UNE_RESERVATION> findUNE_RESERVATIONByCODE(String code);
    public void deleteUNE_RESERVATIONByCODE(String CODE);
    public void updateUNE_RESERVATION(UNE_RESERVATION une_reservation);
    public void deleteAllUNE_RESERVATION();
}


