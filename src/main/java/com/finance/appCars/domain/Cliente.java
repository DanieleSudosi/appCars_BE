package com.finance.appCars.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private long id;

    @Column(name = "carta")
    private String carta;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "utente_id", referencedColumnName = "id")
    private Utente utente;

//    @OneToMany(mappedBy = "cliente_id")
//    private Set<Noleggio> noleggiCliente = new HashSet<>();

//    @OneToMany(mappedBy = "cliente_id")
//    private Set<Movimenti> movimentiCliente = new HashSet<>();

  public Cliente(){}

    public long getId() {return id;}

    public void setId(long id) {this.id = id;}

    public String getCarta() {return carta;}

    public void setCarta(String carta) {this.carta = carta;}

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    //    public Set<Noleggio> getNoleggiCliente() {return noleggiCliente;}
//
//    public void setNoleggiCliente(Set<Noleggio> noleggiCliente) {this.noleggiCliente = noleggiCliente;}
}
