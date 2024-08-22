package com.PA.Practica.Domain.Mapper;

import com.PA.Practica.Domain.Dto.UsuarioDto;
import com.PA.Practica.Persistence.Entity.Usuario;

public class UsuarioMapper {

    public static Usuario toEntity(UsuarioDto userDTO) {
        Usuario user = new Usuario();
        user.setId(userDTO.getId());
        user.setPassword(userDTO.getPassword());
        user.setRole(userDTO.getRole());
        user.setStateUser(userDTO.getStateUser());
        user.setEmail(userDTO.getEmail());
        user.setName(userDTO.getName());
        user.setLastName(userDTO.getLastName());
        return user;
    }

    public static UsuarioDto toDto(Usuario user) {
        UsuarioDto userDTO = new UsuarioDto();
        userDTO.setId(user.getId());
        userDTO.setPassword(user.getPassword());
        userDTO.setRole(user.getRole());
        userDTO.setStateUser(user.getStateUser());
        userDTO.setEmail(user.getEmail());
        userDTO.setName(user.getName());
        userDTO.setLastName(user.getLastName());
        return userDTO;
    }
}
