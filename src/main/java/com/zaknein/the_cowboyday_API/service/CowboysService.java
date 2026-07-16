package com.zaknein.the_cowboyday_API.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zaknein.the_cowboyday_API.entity.Cowboy;
import com.zaknein.the_cowboyday_API.repository.CowboysRepository;

import lombok.AllArgsConstructor;


@AllArgsConstructor
@Service
public class CowboysService {
    private final CowboysRepository cowboysRepository;

    public List<Cowboy> getCowboys() {

        List<Cowboy> cowboys = cowboysRepository.findAll();

        return cowboys;
    }
}
