package com.finance.appCars.repository;

import com.finance.appCars.domain.Noleggio;
import com.finance.appCars.domain.enumeration.Stato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface NoleggioRepository extends JpaRepository<Noleggio,Long>, JpaSpecificationExecutor<Noleggio> {

    List<Noleggio> findAllByStato(Stato s);
    List<Noleggio> findAllByDataInizio(Date dataInizio);
    List<Noleggio> findAllByDataReso(Date dataReso);
}
