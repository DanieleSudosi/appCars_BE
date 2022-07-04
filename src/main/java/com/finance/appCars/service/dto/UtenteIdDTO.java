package com.finance.appCars.service.dto;

import com.finance.appCars.domain.enumeration.Tipologia;

public class UtenteIdDTO {
    private long id ;
    private Tipologia tipologia;
    private String messaggio;

    public UtenteIdDTO() {
    }
    public UtenteIdDTO(String messaggio) {
        this.messaggio = messaggio;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Tipologia getTipologia() {
        return tipologia;
    }

    public void setTipologia(Tipologia tipologia) {
        this.tipologia = tipologia;
    }

    public void setMessaggio(String messaggio) {
        this.messaggio = messaggio;
    }

    public String getMessaggio() {
        return messaggio;
    }
}
