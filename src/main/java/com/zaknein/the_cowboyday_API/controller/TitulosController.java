package com.zaknein.the_cowboyday_API.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zaknein.the_cowboyday_API.entity.Titulos;
import com.zaknein.the_cowboyday_API.service.TitulosService;

import lombok.AllArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@AllArgsConstructor
@RequestMapping("/titulos/")
@RestController
public class TitulosController {

    TitulosService titulosService;

    @GetMapping()
    public List<Titulos> getTitulos() {
        return titulosService.getTitulos();
    }
    
    @PostMapping()
    public Titulos createTitulos(@RequestBody Titulos titulos) {
        
        return titulosService.createTitulos(titulos);
    }
    

    
}
