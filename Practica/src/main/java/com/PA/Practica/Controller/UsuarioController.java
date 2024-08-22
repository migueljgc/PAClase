package com.PA.Practica.Controller;

import com.PA.Practica.Domain.Dto.UsuarioDto;
import com.PA.Practica.Domain.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Usuario/")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/save")
    public UsuarioDto save(@RequestBody UsuarioDto usuarioDto){
        return usuarioService.save(usuarioDto);
    }

    @GetMapping("/get")
    public List<UsuarioDto> get(){return usuarioService.getAll();}

    @PutMapping("/update")
    public ResponseEntity<?> update(@RequestBody UsuarioDto usuarioDto) {
        Optional<UsuarioDto> personTypeDTOOptional = usuarioService.findById(usuarioDto.getId());
        if(personTypeDTOOptional.isPresent()) {
            usuarioService.save(usuarioDto);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
}
