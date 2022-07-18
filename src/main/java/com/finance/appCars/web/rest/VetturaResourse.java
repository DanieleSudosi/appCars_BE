package com.finance.appCars.web.rest;

import com.finance.appCars.domain.Vettura;
import com.finance.appCars.service.VetturaService;
import com.finance.appCars.service.dto.VetturaDTO;
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
        public Vettura addVettura(@RequestBody VetturaDTO vDTO){
        return this.vetturaService.addVettura(vDTO);
    }

    @GetMapping("/vettura")
    public List<Vettura> getVetture(){
        return this.vetturaService.getVetture();
    }

    @GetMapping("/vettura/{id}")
    public Vettura getVetturaById(@PathVariable long id){
        return this.vetturaService.getVetturaById(id);
    }
    @PostMapping("/vettura/filter")
    public List<Vettura> getVettureFilter(@RequestBody VetturaDTO vDTO) {
        return this.vetturaService.getVettureByFilter(vDTO);
    }

    @PutMapping("/vettura")
    public void updateVettura(@RequestBody VetturaDTO vDTO){
        this.vetturaService.updateVettura(vDTO);
    }

    @DeleteMapping("/vettura/{id}")
    public void deleteVettura(@PathVariable long id){
    this.vetturaService.deleteVettura(id);
    }

}
