package com.zaknein.the_cowboyday_API.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zaknein.the_cowboyday_API.entity.Cowboys;
import com.zaknein.the_cowboyday_API.repository.CowboysRepository;

import lombok.AllArgsConstructor;


@AllArgsConstructor
@Service
public class CowboysService {
    private final CowboysRepository cowboysRepository;

    public List<Cowboys> getCowboys() {

        List<Cowboys> cowboys = cowboysRepository.findAll();

        return cowboys;
    }

    public Cowboys getCowboysById(Long id) {

        Cowboys cowboy = cowboysRepository.findById(id)
            .orElseThrow(()-> new RuntimeException());

        return cowboy;
    }
}
