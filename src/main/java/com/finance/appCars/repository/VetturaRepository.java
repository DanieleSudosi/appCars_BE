package com.finance.appCars.repository;

import com.finance.appCars.domain.Vettura;
import com.finance.appCars.domain.enumeration.Alimentazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VetturaRepository extends JpaRepository<Vettura,Long>, JpaSpecificationExecutor<Vettura> {

   List<Vettura> findAllByMarca(String marca);
   List<Vettura> findAllByModello(String modello);
   List<Vettura> findAllByAlimentazione(Alimentazione alimentazione);

}
