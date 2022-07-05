package com.finance.appCars.domain;

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

//    @OneToMany(mappedBy = "noleggiatore")
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

//    public Set<Noleggio> getNoleggiNoleggiatore() {
//        return noleggiNoleggiatore;
//    }
//
//    public void setNoleggiNoleggiatore(Set<Noleggio> noleggiNoleggiatore) {
//        this.noleggiNoleggiatore = noleggiNoleggiatore;
//    }
}
