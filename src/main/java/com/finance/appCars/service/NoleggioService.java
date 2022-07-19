package com.finance.appCars.service;

import com.finance.appCars.domain.Noleggio;
import com.finance.appCars.domain.Vettura;
import com.finance.appCars.domain.enumeration.Stato;
import com.finance.appCars.repository.NoleggioRepository;
import com.finance.appCars.repository.VetturaRepository;
import com.finance.appCars.service.dto.NoleggioDTO;
import com.finance.appCars.service.dto.VetturaDTO;
import com.finance.appCars.service.mapper.NoleggioMapper;
import com.finance.appCars.service.mapper.VetturaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class NoleggioService {
    @Autowired
    private NoleggioRepository noleggioRepository;

    @Autowired
    private VetturaService vetturaService;
    @Autowired
    private VetturaRepository vetturaRepo;
    @Autowired
    private NoleggioMapper noleggioMapper;
    @Autowired
    private VetturaMapper vetturaMapper;

    public Noleggio addNoleggio(NoleggioDTO nDTO) {
        Noleggio n = noleggioMapper.toEntity(nDTO);
        n.setStato(Stato.IN_ATTESA);
        return noleggioRepository.save(n);
    }

    public List<Noleggio> getNoleggi() {
        return noleggioRepository.findAll();
    }

    public Noleggio getNoleggio(long id) {
        return noleggioRepository.findById(id).get();
    }

    public List<Noleggio> getNoleggiByDataInizio(LocalDate dataInizio) {
        return noleggioRepository.findAllByDataInizio(dataInizio);
    }

    public List<Noleggio> getNoleggiByDataReso(LocalDate dataReso) {
        return noleggioRepository.findAllByDataReso(dataReso);
    }

    public List<Noleggio> getNoleggiByStato(Stato s) {
        return noleggioRepository.findAllByStato(s);
    }

    public Noleggio updateNoleggio(Noleggio n) {
        return noleggioRepository.save(n);
    }

    public Noleggio updateNoleggioByStato(Noleggio n, Stato s) {
        n.setStato(s);
        return noleggioRepository.save(n);
    }

    public void deleteNoleggio(long id) {
        noleggioRepository.deleteById(id);
    }

//    public void modificaQuan(Long noleggioId, Stato stato){
//        Noleggio n = noleggioRepository.findById(noleggioId).get();
//        VetturaDTO vDTO = vetturaMapper.toDTO;
//        switch(stato) {
//            case APPROVATO:
//                vDTO.setQuantita(vDTO.getQuantita() - 1);
//                break;
//            case CONCLUSO:
//                vDTO.setQuantita(vDTO.getQuantita()+1);
//                break;
//        }
//        vetturaService.updateVettura(vDTO);
//    }

    public void modificaQuantita(NoleggioDTO nDTO,Stato stato){
        Noleggio n = noleggioMapper.toEntity(nDTO);
        Vettura v = n.getVettura();
        switch (stato) {
            case APPROVATO:
                n.setStato(Stato.APPROVATO);
                v.setQuantita(v.getQuantita() - 1);
                vetturaRepo.save(v);
                noleggioRepository.save(n);
                break;
            case CONCLUSO:
                n.setStato(Stato.CONCLUSO);
                v.setQuantita(v.getQuantita() + 1);
                vetturaRepo.save(v);
                noleggioRepository.save(n);
                break;
        }
    }
}



