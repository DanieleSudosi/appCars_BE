package com.finance.appCars.service.dto;

import com.finance.appCars.domain.Cliente;
import com.finance.appCars.domain.Noleggiatore;
import com.finance.appCars.domain.enumeration.Stato;

import java.time.LocalDate;

public class NoleggioDTO {


    private LocalDate dataInizio;
    private LocalDate dataReso;


    private Stato stato;
    private long noleggiatoreId;
    private long clienteId;
    private long contrattoId;
    private long vetturaId;

    public LocalDate getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(LocalDate dataInizio) {
        this.dataInizio = dataInizio;
    }

    public LocalDate getDataReso() {
        return dataReso;
    }

    public void setDataReso(LocalDate dataReso) {
        this.dataReso = dataReso;
    }

    public long getNoleggiatoreId() {
        return noleggiatoreId;
    }

    public void setNoleggiatoreId(long noleggiatoreId) {
        this.noleggiatoreId = noleggiatoreId;
    }

    public long getClienteId() {
        return clienteId;
    }

    public void setClienteId(long clienteId) {
        this.clienteId = clienteId;
    }

    public long getContrattoId() {
        return contrattoId;
    }

    public void setContrattoId(long contrattoId) {
        this.contrattoId = contrattoId;
    }

    public long getVetturaId() {
        return vetturaId;
    }

    public void setVetturaId(long vetturaId) {
        this.vetturaId = vetturaId;
    }

    public Stato getStato() {
        return stato;
    }

    public void setStato(Stato stato) {
        this.stato = stato;
    }
}
