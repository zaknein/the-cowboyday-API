package com.zaknein.the_cowboyday_API.entity;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
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
    private Long id;


    private String name;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "titulo_cowboy",
        joinColumns = @JoinColumn(name = "titulo_id"),
        inverseJoinColumns = @JoinColumn(name = "cowboy_id")
    )
    @JsonIgnore
    @ToString.Exclude
    @Builder.Default
    private Set<Cowboys> cowboys = new HashSet<>();

    private LocalDateTime created;


    private LocalDateTime updated;
}
