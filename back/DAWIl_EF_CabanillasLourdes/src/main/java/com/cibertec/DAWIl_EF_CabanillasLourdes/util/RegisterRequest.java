package com.cibertec.DAWIl_EF_CabanillasLourdes.util;

import com.cibertec.DAWIl_EF_CabanillasLourdes.entity.Role;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {
    String username;
    String password;
    String name;
    String lastname;
    String email;
    int kind;
}
