//package com.finance.appCars.domain;
//
//import javax.persistence.*;
//import java.util.Set;
//
//@Entity
//@Table(name = "tipo_contratto")
//public class TipoContratto {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
//    @SequenceGenerator(name = "sequenceGenerator")
//    private long id;
//
//    @ManyToOne
//    @JoinColumn(name = "servizi_id")
//    private Servizio servizi;
//
//    @ManyToOne
//    @JoinColumn(name = "contratto_id")
//    private Contratto contratto;
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public Servizio getServizi() {
//        return servizi;
//    }
//
//    public void setServizi(Servizio servizi) {
//        this.servizi = servizi;
//    }
//
//    public Contratto getContratto() {
//        return contratto;
//    }
//
//    public void setContratto(Contratto contratto) {
//        this.contratto = contratto;
//    }
//}
