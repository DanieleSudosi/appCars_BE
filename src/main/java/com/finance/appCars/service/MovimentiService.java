package com.finance.appCars.service;

import com.finance.appCars.domain.Movimenti;
import com.finance.appCars.repository.MovimentiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class MovimentiService {
    @Autowired
    private MovimentiRepository movimentiRepository;

    public List<Movimenti> getMovimenti(){ return movimentiRepository.findAll();}

    public Movimenti getMovimentiById(long id){return movimentiRepository.findById(id).get();}

    public List<Movimenti> getMovimentiByDate(Date dataPagamento){ return movimentiRepository.findAllByDataPagamento(dataPagamento);}

    public void deleteMovimento(long id){movimentiRepository.deleteById(id);}
}
