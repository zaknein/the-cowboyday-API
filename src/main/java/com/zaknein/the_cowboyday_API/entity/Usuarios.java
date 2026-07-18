package com.zaknein.the_cowboyday_API.entity;

import java.time.LocalDateTime;
import java.util.Collection;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Usuarios {


    @Id
    @GeneratedValue
    private int id;


    private String email;

    private String hash;

    private String estado;

    private String rol;

    private LocalDateTime created;


    public Collection<SimpleGrantedAuthority> getAuthorities() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAuthorities'");
    }

    public String getEmail() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEmail'");
    }

}
