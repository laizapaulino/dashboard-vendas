package com.laipim.dsvendas.services;

import com.laipim.dsvendas.DTO.SaleDTO;
import com.laipim.dsvendas.DTO.SellerDTO;
import com.laipim.dsvendas.entities.Sale;
import com.laipim.dsvendas.entities.Seller;
import com.laipim.dsvendas.repositories.SaleRepository;
import com.laipim.dsvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service //Permite injeção do serviço
public class SaleService {

    @Autowired
    private SaleRepository repository;

    @Autowired
    private SellerRepository sellerRepository;


    @Transactional(readOnly = true)//Para não travar bd
    public Page<SaleDTO> findAll(Pageable pageable){
        System.out.println("=========================");
        sellerRepository.findAll();
        Page<Sale> result = repository.findAll(pageable);

        return result.map(element -> new SaleDTO(element));
    }

    public Sale findById(Long id){
        return repository.findById(id).get();
    }
}
