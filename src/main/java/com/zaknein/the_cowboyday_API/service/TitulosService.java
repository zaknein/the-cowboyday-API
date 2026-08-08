package com.zaknein.the_cowboyday_API.service;

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

    public String createTitulos() {




        
    }
    
}
