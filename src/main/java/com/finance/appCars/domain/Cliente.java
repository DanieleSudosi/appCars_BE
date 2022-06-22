package com.finance.appCars.domain;

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

    @OneToMany(mappedBy = "cliente")
    private Set<Noleggio> noleggiCliente = new HashSet<>();

  public Cliente(){}

    public long getId() {return id;}

    public void setId(long id) {this.id = id;}

    public String getCarta() {return carta;}

    public void setCarta(String carta) {this.carta = carta;}

    public Set<Noleggio> getNoleggiCliente() {return noleggiCliente;}

    public void setNoleggiCliente(Set<Noleggio> noleggiCliente) {this.noleggiCliente = noleggiCliente;}
}