package com.zaknein.the_cowboyday_API.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zaknein.the_cowboyday_API.repository.TontosRepository;
import com.zaknein.the_cowboyday_API.entity.Tontos;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class TontosService {
    
    TontosRepository tontosRepository;
/*
    public Tontos createTonto{

    }
*/
    public Tontos getTontoHoy{

    } 

    public Tontos getTontoById(Long id){
        return tontosRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("no tontos con ese id"));
    }

    public List<Tontos> getAllTontos(){
        List<Tontos> tontos = tontosRepository.findAll();

        return tontos;
    }
}
