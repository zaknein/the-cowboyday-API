package com.zaknein.the_cowboyday_API.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zaknein.the_cowboyday_API.entity.Cowboy;



@Repository
public interface CowboysRepository extends JpaRepository<Cowboy, Long> {

    

}
