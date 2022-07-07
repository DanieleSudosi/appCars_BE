package com.finance.appCars.service.dto;

import com.finance.appCars.domain.Noleggiatore;
import com.finance.appCars.domain.enumeration.Alimentazione;

public class VetturaDTO {

    private long id;

    private String marca;
    private String modello;
    private Alimentazione alimentazione;
    private String descrizione;
    private Integer quantita;
    private long noleggiatoreId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public Alimentazione getAlimentazione() {
        return alimentazione;
    }

    public void setAlimentazione(Alimentazione alimentazione) {
        this.alimentazione = alimentazione;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Integer getQuantita() {
        return quantita;
    }

    public void setQuantita(Integer quantita) {
        this.quantita = quantita;
    }

    public long getNoleggiatoreId() {
        return noleggiatoreId;
    }

    public void setNoleggiatoreId(long noleggiatoreId) {
        this.noleggiatoreId = noleggiatoreId;
    }
}
