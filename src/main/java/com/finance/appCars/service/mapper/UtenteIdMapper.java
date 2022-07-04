package com.finance.appCars.service.mapper;

import com.finance.appCars.domain.Utente;
import com.finance.appCars.service.dto.UtenteIdDTO;


public class UtenteIdMapper {
    public UtenteIdDTO toDto(Utente u) {
        UtenteIdDTO uDTO = new UtenteIdDTO();
        uDTO.setId(u.getId());
        uDTO.setTipologia(u.getTipologia());
        return uDTO;
    }
}
