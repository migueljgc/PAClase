package com.PA.Practica.Domain.Service;

import com.PA.Practica.Domain.Dto.RoleDto;
import com.PA.Practica.Domain.Dto.UsuarioDto;
import com.PA.Practica.Domain.Mapper.RoleMapper;
import com.PA.Practica.Domain.Mapper.UsuarioMapper;
import com.PA.Practica.Persistence.Repository.RoleRepository;
import com.PA.Practica.Persistence.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;


    public List<RoleDto> getAll() {
        return roleRepository.findAll().stream().map(RoleMapper::toDto).collect(Collectors.toList());
    }

    public Optional<RoleDto> findById(Long id) {
        return roleRepository.findById(id).map(RoleMapper::toDto);
    }

    public RoleDto save(RoleDto roleDto) {
        roleRepository.save(RoleMapper.toEntity(roleDto));
        return roleDto;
    }
}
