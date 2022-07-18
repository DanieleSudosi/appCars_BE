package com.finance.appCars.service.mapper;

import com.finance.appCars.domain.Cliente;
import com.finance.appCars.domain.Noleggiatore;
import com.finance.appCars.domain.Utente;
import com.finance.appCars.repository.UtenteRepository;
import com.finance.appCars.service.dto.UtenteNoleggiatoreDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtenteNoleggiatoreMapper {
    @Autowired
    private UtenteRepository utenteRepository;

    public UtenteNoleggiatoreDTO toDto(Noleggiatore n){
        UtenteNoleggiatoreDTO uDTO = new UtenteNoleggiatoreDTO();
        Utente u = utenteRepository.findById(n.getUtente().getId()).orElse(new Utente());
        uDTO.setId(n.getId());
        uDTO.setNome(u.getNome());
        uDTO.setCognome(u.getCognome());
        return uDTO;
    }
}
