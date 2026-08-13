package com.zaknein.the_cowboyday_API.entity;

import java.time.LocalDateTime;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Titulos {
    

    @Id
    @GeneratedValue
    private Integer id;


    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cowboy_id")
    @JsonIgnore
    @ToString.Exclude
    private Cowboys cowboy;

    private LocalDateTime created;


    private LocalDateTime updated;
}
