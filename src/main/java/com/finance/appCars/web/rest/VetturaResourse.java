package com.finance.appCars.web.rest;

import com.finance.appCars.domain.Vettura;
import com.finance.appCars.domain.enumeration.Alimentazione;
import com.finance.appCars.service.VetturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class VetturaResourse {

    @Autowired
    private VetturaService vetturaService;

    @PostMapping("/vettura")
        public Vettura addVettura(@RequestBody Vettura v){
        return this.vetturaService.addVettura(v);
    }

    @GetMapping("/vettura")
    public List<Vettura> getVetture(){
        return this.vetturaService.getVetture();
    }

    @GetMapping("/vettura/{id}")
    public Vettura getVetturaById(@PathVariable long id){
        return this.vetturaService.getVetturaById(id);
    }
    @GetMapping("/vettura/{marca}")
    public List<Vettura> getVettureByMarca(@PathVariable String marca) {
        return this.vetturaService.getVettureByMarca(marca);
    }
    @GetMapping("/vettura/{modello}")
    public List<Vettura> getVetturaByModello(@PathVariable String modello) {
        return this.vetturaService.getVettureByModello(modello);
    }
    @GetMapping("/vettura/{alimentazione}")
    public List<Vettura> getVetturaByAlimentazione(@PathVariable Alimentazione alimentazione) {
        return this.vetturaService.getVettureByAlimentazione(alimentazione);
    }

    @PutMapping("/vettura")
    public void updateVettura(@RequestBody Vettura v){
        this.vetturaService.updateVettura(v);
    }

    @DeleteMapping("/vettura/{id}")
    public void deleteVettura(@PathVariable long id){
    this.vetturaService.deleteVettura(id);
    }

}
