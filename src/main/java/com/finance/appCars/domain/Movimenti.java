package com.finance.appCars.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "movimenti")
public class Movimenti {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private long id;

    @Column(name = "data_pagamento")
//    @JsonFormat(pattern = "yyyy-MM-dd")
//    @Temporal(TemporalType.DATE)
    private LocalDate dataPagamento;

    @ManyToOne
    @JoinColumn(name="cliente_id", nullable=false)
    private Cliente cliente;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}

