package com.finance.appCars.service.mapper;

import com.finance.appCars.domain.*;
import com.finance.appCars.repository.NoleggiatoreRepository;
import com.finance.appCars.service.dto.VetturaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VetturaMapper {
    @Autowired
    private NoleggiatoreRepository noleggiatoreRepository;


    public Vettura toEntity(VetturaDTO vDTO) {
        Vettura v = new Vettura();
        v.setId(vDTO.getId());
        v.setMarca(vDTO.getMarca());
        v.setModello(vDTO.getModello());
        v.setAlimentazione(vDTO.getAlimentazione());
        v.setQuantita(vDTO.getQuantita());
        v.setDescrizione(vDTO.getDescrizione());

        Noleggiatore nol = noleggiatoreRepository.findById(vDTO.getNoleggiatoreId()).orElse(null);
        v.setNoleggiatore(nol);
        return v;
    }
}

