package com.finance.appCars.repository;

import com.finance.appCars.domain.Cliente;
import com.finance.appCars.domain.Contratto;
import com.finance.appCars.domain.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long> , JpaSpecificationExecutor<Cliente> {
    Cliente findByUtente(Utente utente);

}
