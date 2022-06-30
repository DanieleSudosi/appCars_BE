package com.finance.appCars.repository;

import com.finance.appCars.domain.Utente;
import com.finance.appCars.domain.enumeration.Tipologia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UtenteRepository extends JpaRepository<Utente,Long>, JpaSpecificationExecutor<Utente> {

    public Utente findUtenteByUsername (String username);

    public List<Utente> findByTipologia(Tipologia tipologia);
}
