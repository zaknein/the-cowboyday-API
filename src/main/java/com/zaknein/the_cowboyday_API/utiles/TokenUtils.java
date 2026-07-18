package com.zaknein.the_cowboyday_API.utiles;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.jwt.JwtClaimsSet;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.JwtEncoderParameters;

import com.zaknein.the_cowboyday_API.entity.Usuarios;



public class TokenUtils {
 public static String generate(JwtEncoder encoder, Usuarios user, Long expirationInMinutes) {
        final var now = Instant.now();
        final var scope = user.getAuthorities().stream()
                .map(grantedAuthority -> grantedAuthority.getAuthority())
                .collect(Collectors.joining(","));
        final var claims = JwtClaimsSet.builder()
                .issuer("self")
                .issuedAt(now)
                .expiresAt(now.plus(expirationInMinutes, ChronoUnit.MINUTES))
                .subject(user.getEmail())
                .claim("scope", scope)
                .build();
        return encoder.encode(JwtEncoderParameters.from(claims)).getTokenValue();
    }

    public static Collection<SimpleGrantedAuthority> extractAuthorities(Jwt jwt) {
        String scope = jwt.getClaimAsString("scope");
        if (scope == null || scope.isEmpty()) {
            return List.of();
        }

        return Arrays.stream(scope.split(",")).map(SimpleGrantedAuthority::new).collect(Collectors.toList());
    }
}