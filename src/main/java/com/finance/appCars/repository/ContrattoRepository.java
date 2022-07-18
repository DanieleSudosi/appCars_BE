package com.finance.appCars.repository;

import com.finance.appCars.domain.Contratto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ContrattoRepository  extends JpaRepository<Contratto,Long>, JpaSpecificationExecutor<Contratto> {

    //public List<Contratto> findContrattosByCostoMensile(BigDecimal costoMensile);



    @Query(value="Select c FROM Contratto c WHERE "
            + "(c.costoMensile = :costoMensile OR :costoMensile is null) "
            + "AND (c.titoloContratto LIKE concat('%',:titoloContratto,'%') OR :titoloContratto is null) "
            + "AND (c.descrizioneContratto LIKE concat('%',:descrizioneContratto,'%') OR :descrizioneContratto is null) "
            + "AND (c.durataMax = :durataMax OR :durataMax is null) "
            + "AND (c.durataMin = :durataMin OR :durataMin is null) "
    )
    List<Contratto> findContrattiByFilter(@Param(value="costoMensile") BigDecimal costoMensile,
                                          @Param(value="titoloContratto") String titoloContratto,
                                          @Param(value = "descrizioneContratto") String descrizioneContratto,
                                          @Param(value="durataMax") Integer durataMax,
                                          @Param(value="durataMin") Integer durataMin);

    List<Contratto> findContrattosByCostoMensile(BigDecimal costoMensile);


}
