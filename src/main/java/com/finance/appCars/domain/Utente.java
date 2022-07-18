package com.finance.appCars.domain;


import com.finance.appCars.domain.enumeration.Tipologia;

import javax.persistence.*;

@Entity
@Table(name = "utente")
public class Utente {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private long id ;

    @Column(name = "username", unique = true)
    private String username;

    @Column(name = "password")
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipologia")
    private Tipologia tipologia;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cognome")
    private String cognome;

    //@OneToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name = "cliente_id", referencedColumnName = "id")
    //private Cliente cliente;

    //@OneToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name = "noleggiatore_id", referencedColumnName = "id")
    //private Noleggiatore noleggiatore;

    public Utente(){}


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Tipologia getTipologia() {
        return tipologia;
    }

    public void setTipologia(Tipologia tipologia) {
        this.tipologia = tipologia;
    }

    //public Cliente getCliente() {
        //return cliente;
    //}

    //public void setCliente(Cliente cliente) {
        //this.cliente = cliente;
    //}

    //public Noleggiatore getNoleggiatore() {
        //return noleggiatore;
    //}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    //public void setNoleggiatore(Noleggiatore noleggiatore) {
        //this.noleggiatore = noleggiatore;

    //}

}
