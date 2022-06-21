package com.finance.appCars.service;



import com.finance.appCars.domain.Contratto;
import com.finance.appCars.repository.ContrattoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ContrattoService {
    @Autowired
    private ContrattoRepository contrattoRepository;

    public Contratto addContratto(Contratto c){return contrattoRepository.save(c);}

    public List<Contratto> getContratti(){ return contrattoRepository.findAll();}

    public Contratto getContrattoById(long id){return contrattoRepository.findById(id).get();}

    public List<Contratto> getContrattiByCosto(BigDecimal costoMensile){ return contrattoRepository.findContrattosByCostoMensile(costoMensile);}

    public Contratto updateContratto(Contratto c){return contrattoRepository.save(c);}

    public void deleteContratto(long id){contrattoRepository.deleteById(id);}
}
