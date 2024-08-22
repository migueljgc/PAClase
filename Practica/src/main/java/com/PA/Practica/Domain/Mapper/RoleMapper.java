package com.PA.Practica.Domain.Mapper;

import com.PA.Practica.Domain.Dto.RoleDto;
import com.PA.Practica.Domain.Dto.UsuarioDto;
import com.PA.Practica.Persistence.Entity.Role;
import com.PA.Practica.Persistence.Entity.Usuario;

public class RoleMapper {

    public static Role toEntity(RoleDto roleDto) {
        Role role = new Role();
        role.setId(roleDto.getId());
        role.setRoles(roleDto.getRoles());
        return role;
    }

    public static RoleDto toDto(Role role) {
        RoleDto roleDto = new RoleDto();
        roleDto.setId(role.getId());
        roleDto.setRoles(role.getRoles());
        return roleDto;
    }
}
