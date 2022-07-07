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

    @Enumerated(EnumType.STRING)
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


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Stato getStato() {
        return stato;
    }

    public void setStato(Stato stato) {
        this.stato = stato;
    }

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

    public Noleggiatore getNoleggiatore() {
        return noleggiatore;
    }

    public void setNoleggiatore(Noleggiatore noleggiatore) {
        this.noleggiatore = noleggiatore;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vettura getVettura() {
        return vettura;
    }

    public void setVettura(Vettura vettura) {
        this.vettura = vettura;
    }

    public Contratto getContratto() {
        return contratto;
    }

    public void setContratto(Contratto contratto) {
        this.contratto = contratto;
    }

}
