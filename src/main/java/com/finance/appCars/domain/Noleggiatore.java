package com.finance.appCars.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "noleggiatore")
public class Noleggiatore  {
//extends Utente
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private long id;

    @Column(name = "p_iva")
    private String pIva;

    @OneToMany(mappedBy = "noleggiatore")
    @JsonIgnore
    private Set<Vettura> vettureNoleggiatore = new HashSet<>();

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "utente_id", referencedColumnName = "id")
    private Utente utente;

//    @OneToMany(mappedBy = "noleggiatore")
//
//    private Set<Noleggio> noleggiNoleggiatore = new HashSet<>();

    public Noleggiatore(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getpIva() {
        return pIva;
    }

    public void setpIva(String pIva) {
        this.pIva = pIva;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    //    public Set<Noleggio> getNoleggiNoleggiatore() {
//        return noleggiNoleggiatore;
//    }
//
//    public void setNoleggiNoleggiatore(Set<Noleggio> noleggiNoleggiatore) {
//        this.noleggiNoleggiatore = noleggiNoleggiatore;
//    }

    public Set<Vettura> getVettureNoleggiatore() {
        return vettureNoleggiatore;
    }

    public void setVettureNoleggiatore(Set<Vettura> vettureNoleggiatore) {
        this.vettureNoleggiatore = vettureNoleggiatore;
    }
}
