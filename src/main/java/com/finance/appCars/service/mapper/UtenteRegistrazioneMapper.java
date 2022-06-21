package com.finance.appCars.service.mapper;

import com.finance.appCars.domain.Utente;
import com.finance.appCars.domain.enumeration.Tipologia;
import com.finance.appCars.service.dto.UtenteRegistrazioneDTO;

public class UtenteRegistrazioneMapper {
    public Utente toEntity(UtenteRegistrazioneDTO uDTO, Tipologia tipologia){
        Utente u = new Utente();
        u.setUsername(uDTO.getUsername());
        u.setPassword(uDTO.getPassword());
        u.setNome(uDTO.getNome());
        u.setCognome(uDTO.getCognome());
        u.setTipologia(tipologia);
        return u;
    }
}
