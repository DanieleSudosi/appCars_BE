package com.finance.appCars.service;

import com.finance.appCars.domain.Vettura;
import com.finance.appCars.domain.enumeration.Alimentazione;
import com.finance.appCars.repository.VetturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VetturaService {
    @Autowired
    private VetturaRepository vetturaRepository;

    //post
    public Vettura addVettura(Vettura v){return vetturaRepository.save(v);}
    //put
    public void updateVettura(Vettura v){
        vetturaRepository.save(v);
    }
    //delete
    public void deleteVettura(long id){
        vetturaRepository.deleteById(id);
    }
    //get
    public List<Vettura> getVetture(){return vetturaRepository.findAll();}
    //get by id
    public Vettura getVetturaById(long id){return vetturaRepository.findById(id).get();}
    //get by marca
    public List<Vettura> getVettureByMarca(String marca){ return vetturaRepository.findAllByMarca(marca);}
    //get by modello
    public List<Vettura> getVettureByModello(String modello){return vetturaRepository.findAllByModello(modello);}
    //get by alimentazione
    public List<Vettura> getVettureByAlimentazione(Alimentazione alimentazione){return vetturaRepository.findAllByAlimentazione(alimentazione);}

    }
