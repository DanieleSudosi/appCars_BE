package com.finance.appCars.service;

import com.finance.appCars.domain.Servizio;
import com.finance.appCars.repository.ServizioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServizioService {
    @Autowired
    private ServizioRepository servizioRepository;

    public Servizio addServizio(Servizio s){
        return  servizioRepository.save(s);
    }

    public List<Servizio> getServizi(){
        return servizioRepository.findAll();
    }

    public Servizio getServizioById(long id){
        return servizioRepository.findById(id).get();
    }

    public List<Servizio> getServiziByName(String n){
        return servizioRepository.findAllByNomeServizio(n);
    }

    public Servizio updServizio(Servizio s){
        return servizioRepository.save(s);
    }

    public void deleteServizio(long id){
        servizioRepository.deleteById(id);
    }
}
