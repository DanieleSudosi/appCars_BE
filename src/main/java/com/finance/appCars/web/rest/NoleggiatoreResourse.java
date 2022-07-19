package com.finance.appCars.web.rest;

import com.finance.appCars.domain.Noleggiatore;
import com.finance.appCars.service.NoleggiatoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class NoleggiatoreResourse {

    @Autowired
    private NoleggiatoreService noleggiatoreService;

    @PostMapping("/noleggiatore/filter")
    public List<Noleggiatore> getNoleggiatori(){

        return this.noleggiatoreService.getNoleggiatori();
    }

    @GetMapping("/noleggiatore/{id}")
    public Noleggiatore getNoleggiatoreById(long id){

        return this.noleggiatoreService.getNoleggiatoreById(id);
    }

    @PutMapping("/noleggiatore")
    public void updateNoleggiatore(@RequestBody Noleggiatore n){

        this.noleggiatoreService.updateNoleggiatore(n);
    }

    @DeleteMapping("/noleggiatore/{id}")
    public void deleteNoleggiatore(long id){
        this.noleggiatoreService.deleteNoleggiatore(id);
    }
}
