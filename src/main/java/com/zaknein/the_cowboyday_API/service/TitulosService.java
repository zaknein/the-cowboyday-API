package com.zaknein.the_cowboyday_API.service;

import java.time.LocalDateTime;
import java.util.List;

import com.zaknein.the_cowboyday_API.entity.Cowboys;
import com.zaknein.the_cowboyday_API.entity.Titulos;
import com.zaknein.the_cowboyday_API.repository.TitulosRepository;

public class TitulosService {

    private TitulosRepository titulosRepository;


    public List<Titulos> getTitulos() {

        List<Titulos> titulos = titulosRepository.findAll();

        return titulos;
    }

    public Titulos createTitulos(Titulos titulos) {

        titulos.setCreated(LocalDateTime.now());




        return titulosRepository.save(titulos);
    }    
}
