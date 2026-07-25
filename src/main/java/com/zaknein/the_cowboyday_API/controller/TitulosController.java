package com.zaknein.the_cowboyday_API.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


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


    @GetMapping()
    public List<titulos> getTitulos() {
        return titulosService.getTitulos();
    }
    
    @PostMapping()
    public String createTitulos(@RequestBody String entity) {
        
        return titulosService.createTitulos();
    }
    

    
}
