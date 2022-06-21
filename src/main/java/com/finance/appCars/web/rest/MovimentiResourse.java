package com.finance.appCars.web.rest;

import com.finance.appCars.domain.Movimenti;
import com.finance.appCars.service.MovimentiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class MovimentiResourse {

    @Autowired
    private MovimentiService movimentiService;

    @GetMapping("/movimenti")
    public List<Movimenti> getMovimenti(){
        return this.movimentiService.getMovimenti();
    }

    @GetMapping("/movimenti/{id}")
    public Movimenti getMovimentiById(@PathVariable long id){
        return this.movimentiService.getMovimentiById(id);
    }

    @GetMapping("/movimenti/{data_pagamento}")
    public List<Movimenti> getMovimentiByDate(@PathVariable Date dataPagamento){
        return this.movimentiService.getMovimentiByDate(dataPagamento);
    }

    @DeleteMapping("/movimenti/{id}")
    public void deleteMovimenti(@PathVariable long id){
        this.movimentiService.deleteMovimento(id);
    }
}
