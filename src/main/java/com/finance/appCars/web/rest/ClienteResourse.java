package com.finance.appCars.web.rest;

import com.finance.appCars.domain.Cliente;
import com.finance.appCars.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ClienteResourse {

    @Autowired
    private ClienteService clienteService;

    @PostMapping("/cliente/filter")
    public List<Cliente> getClienti(){
        return this.clienteService.getClienti();
    }

    @GetMapping("/cliente/{id}")
    public Cliente getClienteById(long id){
        return this.clienteService.getClienteById(id);
    }

    @PutMapping("/cliente")
    public void updateCliente(@RequestBody Cliente c){
        this.clienteService.updateCliente(c);
    }

    @DeleteMapping("/cliente/{id}")
    public void deleteCliente(long id){
        this.clienteService.deleteCliente(id);
    }

}
