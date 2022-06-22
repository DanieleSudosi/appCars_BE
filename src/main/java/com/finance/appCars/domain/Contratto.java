package com.finance.appCars.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table (name = "contratto")
public class Contratto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private long id;

    @Column(name = "costo_mensile")
    private BigDecimal costoMensile;

    @Column(name = "titolo_contratto")
    private String titoloContratto;

    @Column(name = "descrizione_contratto")
    private String descrizioneContratto;

    @Column(name = "durata_max")
    private Integer durataMax;

    @Column(name = "durata_min")
    private Integer durataMin;

    @ManyToMany(cascade = { CascadeType.MERGE })
    @JoinTable(
            name = "tipo_contratto",
            joinColumns = { @JoinColumn(name = "contratto_id") },
            inverseJoinColumns = { @JoinColumn(name = "servizi_id") })
    private Set<Servizio> servizi;



    public Contratto(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BigDecimal getCostoMensile() {
        return costoMensile;
    }

    public void setCostoMensile(BigDecimal costoMensile) {
        this.costoMensile = costoMensile;
    }

    public Integer getDurataMax() {
        return durataMax;
    }

    public void setDurataMax(Integer durataMax) {
        this.durataMax = durataMax;
    }

    public Integer getDurataMin() {
        return durataMin;
    }

    public void setDurataMin(Integer durataMin) {
        this.durataMin = durataMin;
    }

    public Set<Servizio> getServizi() {
        return servizi;
    }

    public String getTitoloContratto() {
        return titoloContratto;
    }

    public void setTitoloContratto(String titoloContratto) {
        this.titoloContratto = titoloContratto;
    }

    public String getDescrizioneContratto() {
        return descrizioneContratto;
    }

    public void setDescrizioneContratto(String descrizioneContratto) {
        this.descrizioneContratto = descrizioneContratto;
    }

    public void setServizi(Set<Servizio> servizi) {
        this.servizi = servizi;
    }
}
