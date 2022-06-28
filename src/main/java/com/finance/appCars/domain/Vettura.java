package com.finance.appCars.domain;

import com.finance.appCars.domain.enumeration.Alimentazione;

import javax.persistence.*;


@Entity
@Table(name= "vettura")
public class Vettura {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private long id;

    @Column(name = "marca")
    private String marca;

    @Column(name = "modello")
    private String modello;

    @Enumerated(EnumType.STRING)
    @Column(name = "alimentazione")
    private Alimentazione alimentazione;

    @Column(name = "descrizione")
    private String descrizione;

    @Column(name = "quantita")
    private int quantita;

//    @Column(name = "img")
//    private String immagine;

    public Vettura(long id, String marca, String modello, Alimentazione alimentazione, String descrizione, int quantita) {
        this.id = id;
        this.marca = marca;
        this.modello = modello;
        this.alimentazione = alimentazione;
        this.descrizione = descrizione;
        this.quantita = quantita;
//        this.immagine = immagine;
    }

    public Vettura() {
    }

    //getter
    public long getId() {return id;}

    public String getMarca() {return marca;}

    public String getModello() {return modello;}

    public Alimentazione getAlimentazione() {return alimentazione;}

    public String getDescrizione() {return descrizione;}

    public int getQuantita() {return quantita;}

    //setter

    public void setId(long id) {this.id = id;}

    public void setMarca(String marca) {this.marca = marca;}

    public void setModello(String modello) {this.modello = modello;}

    public void setAlimentazione(Alimentazione alimentazione) {this.alimentazione = alimentazione;}

    public void setDescrizione(String descrizione) {this.descrizione = descrizione;}

    public void setQuantita(int quantita) {this.quantita = quantita;}

}
