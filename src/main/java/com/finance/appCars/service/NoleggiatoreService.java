package com.finance.appCars.service;

import com.finance.appCars.domain.Noleggiatore;
import com.finance.appCars.repository.NoleggiatoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoleggiatoreService {
    @Autowired
    private NoleggiatoreRepository noleggiatoreRepository;


    public Noleggiatore saveNoleggiatore(Noleggiatore n){ return noleggiatoreRepository.save(n);}
    public List<Noleggiatore> getNoleggiatori(){return noleggiatoreRepository.findAll();}

    public Noleggiatore getNoleggiatoreById(long id){return noleggiatoreRepository.findById(id).get();}

    public void updateNoleggiatore(Noleggiatore n){noleggiatoreRepository.save(n);}

    public void deleteNoleggiatore(long id){noleggiatoreRepository.deleteById(id);}
}
