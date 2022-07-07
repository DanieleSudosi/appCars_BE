package com.finance.appCars.web.rest;

import com.finance.appCars.domain.Noleggio;
import com.finance.appCars.domain.Vettura;
import com.finance.appCars.domain.enumeration.Stato;
import com.finance.appCars.service.NoleggioService;
import com.finance.appCars.service.dto.NoleggioDTO;
import com.finance.appCars.service.dto.VetturaDTO;
import org.hibernate.mapping.Any;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;
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

    @GetMapping("/noleggio")
    public List<Noleggio> getNoleggi(){
        return  this.noleggioService.getNoleggi();
    }

    @GetMapping("/noleggio/{id}")
    public Noleggio getNoleggio(@PathVariable long id){
        return  this.noleggioService.getNoleggio(id);
    }
    @GetMapping("noleggio/{dataInizio}")
    public List<Noleggio> getNoleggiByDataInizio(@PathVariable LocalDate dataInizio){
        return this.noleggioService.getNoleggiByDataInizio(dataInizio);
    }
    @GetMapping("noleggio/{dataReso}")
    public List<Noleggio> getNoleggiByDataReso(@PathVariable LocalDate dataReso){
        return this.noleggioService.getNoleggiByDataReso(dataReso);
    }

    @GetMapping("noleggio/stato/{stato}")
    public List<Noleggio> getNoleggiByStato(@PathVariable("stato") Stato stato){
        return this.noleggioService.getNoleggiByStato(stato);
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
    public void setQuantitaByStato(@RequestBody VetturaDTO vDTO, @PathVariable Stato stato){
        this.noleggioService.modificaQuantita(vDTO,stato);
    }
}
