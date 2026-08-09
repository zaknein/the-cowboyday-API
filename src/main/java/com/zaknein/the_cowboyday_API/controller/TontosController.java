package com.zaknein.the_cowboyday_API.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@AllArgsConstructor
@RequestMapping("/tontos/")
@RestController
public class TontosController {
       
    @PostMapping("path")
    public String createTontoHoy(@RequestBody String entity) {
        //TODO: process POST request
        
        return entity;
    }
    /* 
    @GetMapping("/hoy")
    public String getTontoHoy() {
        return new String();
    }
    */

    @GetMapping("/calendario")
    public String getTontoCalendario(@RequestParam String param) {
        return new String();
    }
    
    @GetMapping("/{id}")
    public String getTontoById (@PathVariable Long id) {
        return new String();
    }
    
    @GetMapping()
    public String getTontos() {
        return new String();
    }
    
}
