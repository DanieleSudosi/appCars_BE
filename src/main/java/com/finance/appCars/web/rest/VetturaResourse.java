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

    @PostMapping("/vettura/filter")
    public List<Vettura> getVettureFilter(@RequestBody Vettura v){
        return this.vetturaService.getVettureFilter(v);
    }

    //prova filtro with get
//    @GetMapping("/vettura")
//    public List<Vettura> getVettureFilter(Vettura v) {
//        return this.vetturaService.getVettureFilter(v);
//    }

    @GetMapping("/vettura/{id}")
    public Vettura getVetturaById(@PathVariable long id){
        return this.vetturaService.getVetturaById(id);
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
