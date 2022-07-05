package com.finance.appCars.service;

import com.finance.appCars.domain.Noleggio;
import com.finance.appCars.domain.enumeration.Stato;
import com.finance.appCars.repository.NoleggioRepository;
import com.finance.appCars.service.dto.NoleggioDTO;
import com.finance.appCars.service.mapper.NoleggioMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
public class NoleggioService {
    @Autowired
    private NoleggioRepository noleggioRepository;
    @Autowired
    private NoleggioMapper mapper;

    public Noleggio addNoleggio(NoleggioDTO nDTO){
//        NoleggioMapper mapper = new NoleggioMapper();
        Noleggio n = mapper.toEntity(nDTO);
        n.setStato(Stato.IN_ATTESA);
        return noleggioRepository.save(n);
    }

    public List<Noleggio> getNoleggi(){return noleggioRepository.findAll();}

    public Noleggio getNoleggio(long id){return noleggioRepository.findById(id).get();}

    public List<Noleggio> getNoleggiByDataInizio(LocalDate dataInizio){return noleggioRepository.findAllByDataInizio(dataInizio);}

    public List<Noleggio> getNoleggiByDataReso(LocalDate dataReso){return noleggioRepository.findAllByDataReso(dataReso);}

    public List<Noleggio> getNoleggiByStato(Stato s){
        return noleggioRepository.findAllByStato(s);
    }

    public Noleggio updateNoleggio(Noleggio n){ return noleggioRepository.save(n);}
    public Noleggio updateNoleggioByStato(Noleggio n,Stato s){
        n.setStato(s);
        return noleggioRepository.save(n);
    }

    public void deleteNoleggio(long id){ noleggioRepository.deleteById(id);}
}
