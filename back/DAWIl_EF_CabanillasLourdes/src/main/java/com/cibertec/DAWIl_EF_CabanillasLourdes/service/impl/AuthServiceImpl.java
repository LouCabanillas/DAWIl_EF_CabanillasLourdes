package com.cibertec.DAWIl_EF_CabanillasLourdes.service.impl;

import com.cibertec.DAWIl_EF_CabanillasLourdes.entity.Role;
import com.cibertec.DAWIl_EF_CabanillasLourdes.entity.UserEntity;
import com.cibertec.DAWIl_EF_CabanillasLourdes.jwt.JwtService;
import com.cibertec.DAWIl_EF_CabanillasLourdes.repository.UserRepository;
import com.cibertec.DAWIl_EF_CabanillasLourdes.service.AuthService;
import com.cibertec.DAWIl_EF_CabanillasLourdes.util.AuthResponse;
import com.cibertec.DAWIl_EF_CabanillasLourdes.util.LoginRequest;
import com.cibertec.DAWIl_EF_CabanillasLourdes.util.RegisterRequest;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import lombok.RequiredArgsConstructor;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;
    private final JwtService jwtService;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;

    public AuthResponse login(LoginRequest request) {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
        UserDetails user=userRepository.findByUsername(request.getUsername()).orElseThrow();
        String token=jwtService.getToken(user);
        return AuthResponse.builder()
            .token(token)
            .build();
    }

    public AuthResponse register(RegisterRequest request) {
        UserEntity user = UserEntity.builder()
                .username(request.getUsername())
                .password(passwordEncoder.encode( request.getPassword()))
                .name(request.getName())
                .lastname(request.getLastname())
                .email(request.getEmail())
                .isActive(1)
                .kind(request.getKind())
                .createdAt(new Date())
                .role(Role.USER)
                .build();

        userRepository.save(user);

        return AuthResponse.builder()
                .token(jwtService.getToken(user))
                .build();

    }

}
