package com.finance.appCars.repository;

import com.finance.appCars.domain.Vettura;
import com.finance.appCars.domain.enumeration.Alimentazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VetturaRepository extends JpaRepository<Vettura,Long>, JpaSpecificationExecutor<Vettura> {

    @Query(value = "Select v FROM Vettura v WHERE " +
            "((v.alimentazione = :alimentazione AND :alimentazione is not null) OR :alimentazione is null) "
            + "AND ((v.marca LIKE concat('%',:marca,'%') AND :marca is not null) OR :marca is null) "
            + "AND ((v.modello LIKE concat('%',:modello,'%') AND :modello is not null) OR :modello is null) "
            + "AND ((v.quantita = :quantita AND :quantita is not null) OR :quantita is null)")

   List<Vettura> findVettureByFilter(@Param(value="alimentazione") Alimentazione alimentazione,
                                        @Param(value="marca") String marca,
                                        @Param(value = "modello") String modello,
                                        @Param(value="quantita") Integer quantita);



}
