package com.zaknein.the_cowboyday_API.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.stereotype.Service;

import com.zaknein.the_cowboyday_API.entity.Usuarios;
import com.zaknein.the_cowboyday_API.utiles.TokenUtils;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;



@RequiredArgsConstructor
@Service
public class JwtService {
    
    private final JwtEncoder jwtEncoder;

    @Value("${jwt.refresh.expiration-minutes}")
    private  long refreshExpirationInMinutes;

    @Value("${jwt.session.expiration-minutes}")
    private  long sessionExpirationInMinutes;


    // TODO PARA USAR CUANDO HAYA REFRESH TOKEN
    public String gerateRefreshToken(Usuarios user){
        return TokenUtils.generate(jwtEncoder, user, refreshExpirationInMinutes);
    }

    
    public String gerateSessionToken(Usuarios user){
        return TokenUtils.generate(jwtEncoder, user, sessionExpirationInMinutes);
    }

}