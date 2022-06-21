package com.finance.appCars.service;

import com.finance.appCars.domain.Cliente;
import com.finance.appCars.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente saveCliente(Cliente c){ return clienteRepository.save(c);}

    public List<Cliente> getClienti(){return clienteRepository.findAll();}

    public Cliente getClienteById(long id){return clienteRepository.findById(id).get();}

    public void updateCliente(Cliente c){clienteRepository.save(c);}

    public void deleteCliente(long id){clienteRepository.deleteById(id);}

}
