package com.finance.appCars.web.rest;

import com.finance.appCars.domain.Contratto;
import com.finance.appCars.service.ContrattoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ContrattoResourse {

    @Autowired
    private ContrattoService contrattoService;

    @PostMapping("/contratto")
    public Contratto addContratto(@RequestBody Contratto c){
        return this.contrattoService.addContratto(c);
    }

    @GetMapping("/contratto")
    public List<Contratto> getContratti(){
        return this.contrattoService.getContratti();
    }

    @GetMapping("/contratto/{id}")
    public Contratto getContratto(@PathVariable long id){
        return this.contrattoService.getContrattoById(id);
    }

    @GetMapping("/contratto/{costo}")
    public List<Contratto> getContrattiByCosto(@PathVariable("costo") BigDecimal costoMensile){
        return this.contrattoService.getContrattiByCosto(costoMensile);
    }

    @PutMapping("/contratto")
    public Contratto updateContratto(@RequestBody Contratto c){
        return this.contrattoService.updateContratto(c);
    }

    @DeleteMapping("/contratto/{id}")
    public void deleteContratto(@PathVariable long id){
        this.contrattoService.deleteContratto(id);
    }

}
