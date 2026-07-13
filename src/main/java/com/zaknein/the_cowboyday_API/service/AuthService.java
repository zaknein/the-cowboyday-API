
package com.zaknein.the_cowboyday_API.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.val;

@AllArgsConstructor
@Service
public class AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;

    public AuthResponse register(RegisterRequest request) {

        // Validate email uniqueness
        if (userRepository.existsByEmail(request.email())) {
            throw new CantCreateException("can´t create with email");
        }


        // Create new user
        final var user = User.builder()
                .email(request.email())
                .password(passwordEncoder.encode(request.password()))
                .build();

        final var saved = userRepository.save(user);

        final String token = jwtService.gerateSessionToken(saved);

        // Return authentication response
        return new AuthResponse(new UserSummary(request.email()), token);

    }

    public AuthResponse login(LoginRequest request) {

        final var user = userRepository.findByEmail(request.email()).orElseThrow(() -> {
            throw new InvalidEmailException("Invalid email or password");
        });

        final boolean passwordMatches = passwordEncoder.matches(request.password(), user.getPassword());
        if (!passwordMatches) {
            throw new InvalidEmailException("Invalid email or password");
        }

        final String token = jwtService.gerateSessionToken(user);
        
        return new AuthResponse(new UserSummary(request.email()), token);
    }

}