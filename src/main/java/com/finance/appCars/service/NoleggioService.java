package com.finance.appCars.service;

import com.finance.appCars.domain.Noleggio;
import com.finance.appCars.domain.enumeration.Stato;
import com.finance.appCars.repository.NoleggioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
public class NoleggioService {
    @Autowired
    private NoleggioRepository noleggioRepository;

    public Noleggio addNoleggio(Noleggio n){return noleggioRepository.save(n);}

    public List<Noleggio> getNoleggi(){return noleggioRepository.findAll();}

    public Noleggio getNoleggio(long id){return noleggioRepository.findById(id).get();}

    public List<Noleggio> getNoleggiByDataInizio(LocalDate dataInizio){return noleggioRepository.findAllByDataInizio(dataInizio);}

    public List<Noleggio> getNoleggiByDataReso(LocalDate dataReso){return noleggioRepository.findAllByDataReso(dataReso);}

    public List<Noleggio> getNoleggiByStato(Stato s){return noleggioRepository.findAllByStato(s);}

    public Noleggio updateNoleggio(Noleggio n){ return noleggioRepository.save(n);}

    public void deleteNoleggio(long id){ noleggioRepository.deleteById(id);}
}
