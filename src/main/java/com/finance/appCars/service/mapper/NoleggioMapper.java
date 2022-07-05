package com.finance.appCars.service.mapper;

import com.finance.appCars.domain.*;
import com.finance.appCars.repository.ClienteRepository;
import com.finance.appCars.repository.ContrattoRepository;
import com.finance.appCars.repository.NoleggiatoreRepository;
import com.finance.appCars.repository.VetturaRepository;
import com.finance.appCars.service.dto.NoleggioDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoleggioMapper {

    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private NoleggiatoreRepository noleggiatoreRepository;
    @Autowired
    private ContrattoRepository contrattoRepository;
    @Autowired
    private VetturaRepository vetturaRepository;

    public Noleggio toEntity(NoleggioDTO nDTO) {
        Noleggio n = new Noleggio();
        n.setDataInizio(nDTO.getDataInizio());
        n.setDataReso(nDTO.getDataReso());

        Cliente c = clienteRepository.findById(nDTO.getClienteId()).orElse(null);
        n.setCliente(c);

        Noleggiatore nol = noleggiatoreRepository.findById(nDTO.getNoleggiatoreId()).orElse(null);
        n.setNoleggiatore(nol);

        Contratto con = contrattoRepository.findById(nDTO.getContrattoId()).orElse(null);
        n.setContratto(con);

        Vettura v = vetturaRepository.findById(nDTO.getVetturaId()).orElse(null);
        n.setVettura(v);

        return n;
    }
}
