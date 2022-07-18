package com.finance.appCars.service;

import com.finance.appCars.domain.Vettura;
import com.finance.appCars.domain.enumeration.Alimentazione;
import com.finance.appCars.repository.VetturaRepository;
import com.finance.appCars.service.dto.VetturaDTO;
import com.finance.appCars.service.mapper.VetturaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VetturaService {
    @Autowired
    private VetturaRepository vetturaRepository;
    @Autowired
    private VetturaMapper mapper;

    //post
    public Vettura addVettura(VetturaDTO vDTO){
        Vettura v = mapper.toEntity(vDTO);
        return vetturaRepository.save(v);
    }
    //put
    public void updateVettura(VetturaDTO vDTO){
        Vettura v = mapper.toEntity(vDTO);
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


    public List<Vettura> getVettureByFilter(VetturaDTO v){
        List<Vettura> lista = vetturaRepository.findVettureByFilter(v.getAlimentazione(),
                v.getMarca(),
                v.getModello(),
                v.getQuantita(),
                v.getNoleggiatoreId());
        return lista;
    }
    }
