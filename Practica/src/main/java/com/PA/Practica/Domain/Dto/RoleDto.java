package com.PA.Practica.Domain.Dto;

import com.PA.Practica.Persistence.Entity.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleDto {
    private  long id;

    private String roles;

}
