package com.finance.appCars.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "servizi")
public class Servizio {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private long id;

    @Column(name = "nome_servizio")
    private String nomeServizio;

    @Column(name = "descrizione_servizio")
    private String descrizioneServizio;

    @ManyToMany(mappedBy = "servizi")
    @JsonIgnore
    private Set<Contratto> contratti;

    public Servizio(long id, String nomeServizio, String descrizioneServizio, Set<Contratto> contratti) {
        this.id = id;
        this.nomeServizio = nomeServizio;
        this.descrizioneServizio = descrizioneServizio;
        this.contratti = contratti;
    }
    public Servizio() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeServizio() {
        return nomeServizio;
    }

    public void setNomeServizio(String nomeServizio) {
        this.nomeServizio = nomeServizio;
    }

    public String getDescrizioneServizio() {
        return descrizioneServizio;
    }

    public void setDescrizioneServizio(String descrizioneServizio) {
        this.descrizioneServizio = descrizioneServizio;
    }

    public Set<Contratto> getContratti() {
        return contratti;
    }

    public void setContratti(Set<Contratto> contratti) {
        this.contratti = contratti;
    }
}
