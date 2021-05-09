package com.laipim.dsvendas.controllers;

import com.laipim.dsvendas.DTO.SaleDTO;
import com.laipim.dsvendas.DTO.SaleSuccessDTO;
import com.laipim.dsvendas.DTO.SaleSumDTO;
import com.laipim.dsvendas.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/sales")
public class SaleController {
    @Autowired
    private SaleService service;

    @GetMapping
    public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable){
        Page<SaleDTO> page = service.findAll(pageable);
        return ResponseEntity.ok(page);
    }

    @GetMapping(value = "/amount-by-seller")
    public ResponseEntity<List<SaleSumDTO>> amountGroupBySeller(){
        List<SaleSumDTO> page = service.amountGroupBySeller();
        return ResponseEntity.ok(page);
    }

    @GetMapping(value = "/success-by-seller")
    public ResponseEntity<List<SaleSuccessDTO>> successGroupBySeller(){
        List<SaleSuccessDTO> page = service.successGroupBySeller();
        return ResponseEntity.ok(page);
    }
}
