package com.zaknein.the_cowboyday_API.service;

import org.springframework.stereotype.Service;

import com.zaknein.the_cowboyday_API.repository.CowboysRepository;

import lombok.AllArgsConstructor;


@AllArgsConstructor
@Service
public class CowboysService {
    private final CowboysRepository cowboysRepository;
}
