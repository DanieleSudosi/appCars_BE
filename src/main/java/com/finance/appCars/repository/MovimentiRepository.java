package com.finance.appCars.repository;

import com.finance.appCars.domain.Movimenti;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface MovimentiRepository extends JpaRepository<Movimenti,Long> , JpaSpecificationExecutor<Movimenti> {

    List<Movimenti> findAllByDataPagamento(Date dataPagamento);
}
