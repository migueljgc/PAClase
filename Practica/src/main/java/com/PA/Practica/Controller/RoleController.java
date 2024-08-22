package com.PA.Practica.Controller;

import com.PA.Practica.Domain.Dto.RoleDto;
import com.PA.Practica.Domain.Dto.UsuarioDto;
import com.PA.Practica.Domain.Service.RoleService;
import com.PA.Practica.Domain.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Role/")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @PostMapping("/save")
    public RoleDto save(@RequestBody RoleDto roleDto){
        return roleService.save(roleDto);
    }

    @GetMapping("/get")
    public List<RoleDto> get(){return roleService.getAll();}

    @PutMapping("/update")
    public ResponseEntity<?> update(@RequestBody RoleDto roleDto) {
        Optional<RoleDto> personTypeDTOOptional = roleService.findById(roleDto.getId());
        if(personTypeDTOOptional.isPresent()) {
            roleService.save(roleDto);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
}
