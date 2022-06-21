package com.finance.appCars.repository;

import com.finance.appCars.domain.Contratto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ContrattoRepository  extends JpaRepository<Contratto,Long>, JpaSpecificationExecutor<Contratto> {

    public List<Contratto> findContrattosByCostoMensile(BigDecimal costoMensile);

}
