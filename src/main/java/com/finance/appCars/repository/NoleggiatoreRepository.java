package com.finance.appCars.repository;

import com.finance.appCars.domain.Noleggiatore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


@Repository
public interface NoleggiatoreRepository extends JpaRepository<Noleggiatore,Long>, JpaSpecificationExecutor<Noleggiatore> {
}
