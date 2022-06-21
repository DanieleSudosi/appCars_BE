package com.finance.appCars.web.rest;

import com.finance.appCars.domain.Servizio;
import com.finance.appCars.service.ServizioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ServizioResourse {

    @Autowired
    private ServizioService servizioService;

    @PostMapping("/servizio")
    public Servizio addServizio(@RequestBody Servizio s){
        return this.servizioService.addServizio(s);
    }
    @GetMapping("/servizio")
    public List<Servizio> getServizi(){
        return this.servizioService.getServizi();
    }
    @GetMapping("/servizio/{id}")
    public Servizio getServizioById(@PathVariable long id){
        return this.servizioService.getServizioById(id);
    }

    @GetMapping("/servizio/{nome}")
    public List<Servizio> getServizioByNome(@PathVariable String n){
        return this.servizioService.getServiziByName(n);
    }

    @PutMapping("/servizio")
    public Servizio updateServizio(@RequestBody Servizio s){
        return this.servizioService.updServizio(s);
    }
    @DeleteMapping("/servizio/{id}")
    public void deleteServizio(@PathVariable long id){
        this.servizioService.deleteServizio(id);
    }

}
