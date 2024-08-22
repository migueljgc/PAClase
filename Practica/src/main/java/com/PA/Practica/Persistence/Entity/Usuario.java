package com.PA.Practica.Persistence.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Usuario")
public class Usuario {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;

    @Column(name = "name")
    private String name;

    @Column(name = "Apellido_Persona")
    private String lastName;

    @Column(name = "Correo_Persona", unique = true)
    private String email;

    @Column(name = "Contraseña")
    private String password;

    @JoinColumn(name = "Roles")
    @ManyToOne
    private Role role;

    @Column(name = "Estado_Usuario")
    private String stateUser;
}
