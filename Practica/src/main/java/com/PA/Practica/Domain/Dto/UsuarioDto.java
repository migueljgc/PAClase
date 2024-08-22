package com.PA.Practica.Domain.Dto;

import com.PA.Practica.Persistence.Entity.Role;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDto {
    private  long id;

    private String name;

    private String lastName;

    private String email;

    private String password;

    private Role role;

    private String stateUser;
}
