package com.finance.appCars.repository;

import com.finance.appCars.domain.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UtenteRepository extends JpaRepository<Utente,Long>, JpaSpecificationExecutor<Utente> {

    public Utente findUtenteByUsername (String username);
}
