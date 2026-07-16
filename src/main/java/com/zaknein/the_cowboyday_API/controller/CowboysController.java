package com.zaknein.the_cowboyday_API.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zaknein.the_cowboyday_API.entity.Cowboy;
import com.zaknein.the_cowboyday_API.service.CowboysService;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;




@AllArgsConstructor
@RequestMapping("/cowboys/")
@RestController
public class CowboysController {    

    CowboysService cowboysService;
    

    @GetMapping()
    public List<Cowboy> getCowboys() {
        return cowboysService.getCowboys();
    }
    


}
