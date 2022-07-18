package com.finance.appCars.web.rest;

import com.finance.appCars.domain.Noleggio;

import com.finance.appCars.domain.enumeration.Stato;
import com.finance.appCars.service.NoleggioService;
import com.finance.appCars.service.dto.NoleggioDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class NoleggioResourse {

    @Autowired
    private NoleggioService noleggioService;

    @PostMapping("/noleggio")
    public Noleggio addNoleggio(@RequestBody NoleggioDTO nDTO){
        return this.noleggioService.addNoleggio(nDTO);
    }

    @PostMapping("/noleggio/filter")
    public List<Noleggio> getNoleggi(){
        return  this.noleggioService.getNoleggi();
    }

    @GetMapping("/noleggio/{id}")
    public Noleggio getNoleggio(@PathVariable long id){
        return  this.noleggioService.getNoleggio(id);
    }

    @PutMapping("noleggio")
    public Noleggio updateNoleggio(@RequestBody Noleggio n){
        return this.noleggioService.updateNoleggio(n);
    }


    @DeleteMapping("noleggio/{id}")
    public void deleteNoleggio(@PathVariable long id){
        this.noleggioService.deleteNoleggio(id);
    }

    @PutMapping("noleggio/{stato}")
    public void setQuantitaByStato(@RequestBody NoleggioDTO nDTO, @PathVariable Stato stato){
        this.noleggioService.modificaQuantita(nDTO,stato);
    }
}
