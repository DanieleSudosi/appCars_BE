package com.finance.appCars.repository;


import com.finance.appCars.domain.Servizio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServizioRepository extends JpaRepository<Servizio,Long>, JpaSpecificationExecutor<Servizio> {

    List<Servizio> findAllByNomeServizio(String nomeServizio);
}
