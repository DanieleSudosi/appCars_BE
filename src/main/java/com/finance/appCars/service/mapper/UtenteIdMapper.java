package com.finance.appCars.service.mapper;

import com.finance.appCars.domain.Cliente;
import com.finance.appCars.domain.Noleggiatore;
import com.finance.appCars.domain.Utente;
import com.finance.appCars.domain.enumeration.Tipologia;
import com.finance.appCars.repository.ClienteRepository;
import com.finance.appCars.repository.NoleggiatoreRepository;
import com.finance.appCars.service.dto.UtenteIdDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtenteIdMapper {
    @Autowired
    private ClienteRepository clienteRepository;
    public UtenteIdDTO toDto(Utente u) {
        UtenteIdDTO uDTO = new UtenteIdDTO();
//        Cliente c = clienteRepository.findByUtente(u);
        uDTO.setTipologia(u.getTipologia());
        if(u.getTipologia().equals(Tipologia.CLIENTE)){
            uDTO.setId(u.getId());
        }else{
            u.getTipologia().equals(Tipologia.NOLEGGIATORE);
            uDTO.setId(u.getId());
        }
        return uDTO;
    }
}
