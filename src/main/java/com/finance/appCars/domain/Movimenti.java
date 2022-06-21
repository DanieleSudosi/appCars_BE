package com.finance.appCars.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "movimenti")
public class Movimenti {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private long id;

    @Column(name = "data_pagamento")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date dataPagamento;

    @ManyToOne
    @JoinColumn(name="noleggio_id", nullable=false)
    private Noleggio noleggio;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Noleggio getNoleggio() {
        return noleggio;
    }

    public void setNoleggio(Noleggio noleggio) {
        this.noleggio = noleggio;
    }
}

