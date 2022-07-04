package com.finance.appCars.service.mapper;

import com.finance.appCars.domain.Utente;
import com.finance.appCars.service.dto.UtenteNoleggiatoreDTO;


public class UtenteNoleggiatoreMapper {

    public UtenteNoleggiatoreDTO toDto(Utente u){
        UtenteNoleggiatoreDTO uDTO = new UtenteNoleggiatoreDTO();
        uDTO.setId(u.getId());
        uDTO.setNome(u.getNome());
        uDTO.setCognome(u.getCognome());
        return uDTO;
    }
}
