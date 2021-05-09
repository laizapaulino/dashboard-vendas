package com.laipim.dsvendas.repositories;

import com.laipim.dsvendas.DTO.SaleSuccessDTO;
import com.laipim.dsvendas.DTO.SaleSumDTO;
import com.laipim.dsvendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SaleRepository extends JpaRepository<Sale, Long> {
    @Query("SELECT new  com.laipim.dsvendas.DTO.SaleSumDTO(obj.seller, SUM(obj.amount))" +
            "FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSumDTO> amountGroupBySeller();

    @Query("SELECT new  com.laipim.dsvendas.DTO.SaleSuccessDTO(obj.seller, SUM(obj.visited),SUM(obj.deals))" +
            "FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSuccessDTO> successGroupBySeller();
}
