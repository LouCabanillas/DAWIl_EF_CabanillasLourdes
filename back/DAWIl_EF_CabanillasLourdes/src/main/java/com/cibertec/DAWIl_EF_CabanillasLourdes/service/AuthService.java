package com.cibertec.DAWIl_EF_CabanillasLourdes.service;

import com.cibertec.DAWIl_EF_CabanillasLourdes.util.AuthResponse;
import com.cibertec.DAWIl_EF_CabanillasLourdes.util.LoginRequest;
import com.cibertec.DAWIl_EF_CabanillasLourdes.util.RegisterRequest;

public interface AuthService {

    public AuthResponse login(LoginRequest request);

    public AuthResponse register(RegisterRequest request);

}
