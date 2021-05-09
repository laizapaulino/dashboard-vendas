package com.laipim.dsvendas.services;

import com.laipim.dsvendas.DTO.SellerDTO;
import com.laipim.dsvendas.entities.Seller;
import com.laipim.dsvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service //Permite injeção do serviço
public class SellerService {

    @Autowired
    private SellerRepository repository;

    public List<SellerDTO> findAll(){

        List<Seller> result = repository.findAll();

        return result.stream().map(element -> new SellerDTO(element)).collect(Collectors.toList());
    }

    public Seller findById(Long id){
        return repository.findById(id).get();
    }
}
