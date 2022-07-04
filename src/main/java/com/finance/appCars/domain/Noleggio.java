package com.finance.appCars.domain;
import com.finance.appCars.domain.enumeration.Stato;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "noleggio")
public class Noleggio {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private long id;

    @Column(name = "stato")
    private Stato stato;

    @Column(name = "data_inizio")
    private LocalDate dataInizio;

    @Column(name = "data_reso")
    private LocalDate dataReso;

    @ManyToOne
    @JoinColumn(name="noleggiatore_id", nullable=false)
    private Noleggiatore noleggiatore;

    @ManyToOne
    @JoinColumn(name="cliente_id", nullable=false)
    private Cliente cliente;

    @OneToOne
    @JoinColumn(name="vettura_id", nullable=false)
    private Vettura vettura;

    @ManyToOne
    @JoinColumn(name="contratto_id", nullable=false)
    private Contratto contratto;

}
