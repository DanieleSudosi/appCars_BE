package com.finance.appCars.service.mapper;

import com.finance.appCars.domain.Utente;
import com.finance.appCars.domain.enumeration.Tipologia;
import com.finance.appCars.service.dto.UtenteIdDTO;


public class UtenteIdMapper {
    public UtenteIdDTO toDto(Utente u) {
        UtenteIdDTO uDTO = new UtenteIdDTO();
        uDTO.setTipologia(u.getTipologia());
        if(u.getTipologia().equals(Tipologia.CLIENTE)){
            uDTO.setId(u.getCliente().getId());
            uDTO.setCarta(u.getCliente().getCarta());
        }
        return uDTO;
    }
}
