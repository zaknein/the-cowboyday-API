package com.zaknein.the_cowboyday_API.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zaknein.the_cowboyday_API.entity.Tontos;

@Repository
public interface TontosRepository extends JpaRepository<Tontos, Integer> {

	List<Tontos> findByDateBetween(LocalDate firstDate, LocalDate lastDate);
    
}
