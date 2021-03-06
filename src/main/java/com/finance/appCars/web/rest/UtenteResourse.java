package com.finance.appCars.web.rest;

import com.finance.appCars.domain.Utente;
import com.finance.appCars.domain.enumeration.Tipologia;
import com.finance.appCars.service.UtenteService;
import com.finance.appCars.service.dto.UtenteIdDTO;
import com.finance.appCars.service.dto.UtenteLoginDTO;
import com.finance.appCars.service.dto.UtenteNoleggiatoreDTO;
import com.finance.appCars.service.dto.UtenteRegistrazioneDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class UtenteResourse {

    @Autowired
    private UtenteService utenteService;

    @PostMapping("/utente-noleggiatore")
    public Utente registrazioneNoleggiatore(@RequestBody UtenteRegistrazioneDTO uDTO){
        return this.utenteService.addUtente(uDTO,Tipologia.NOLEGGIATORE);
    }

    @PostMapping("/utente-cliente")
    public Utente registrazioneCliente(@RequestBody UtenteRegistrazioneDTO uDTO){
        return this.utenteService.addUtente(uDTO,Tipologia.CLIENTE);
    }

    @PostMapping("/utente/filter")
    public List<Utente> getUtenti(){

        return this.utenteService.getUtenti();
    }

    @GetMapping("/utente/{id}")
    public Utente getUtenteById(@PathVariable long id){

        return this.utenteService.getUtenteById(id);
    }

    @PutMapping("/utente")
    public void updateUtente(@RequestBody Utente u){

        this.utenteService.updateUtente(u);
    }

    @DeleteMapping("/utente/{id}")
    public void deleteVettura(@PathVariable long id){

        this.utenteService.deleteUtente(id);
    }

    @PostMapping("/login")
    public ResponseEntity<UtenteIdDTO> login(@RequestBody UtenteLoginDTO uDTO) {
        try {
        return ResponseEntity.ok(this.utenteService.login(uDTO));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new UtenteIdDTO(e.getMessage()));
        }
    }

    @GetMapping("/noleggiatore")
    public List<UtenteNoleggiatoreDTO> getNoleggiatori(){

        return this.utenteService.getNoleggiatori();
    }




}
