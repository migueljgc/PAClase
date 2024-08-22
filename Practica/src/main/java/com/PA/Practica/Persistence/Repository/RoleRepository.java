package com.PA.Practica.Persistence.Repository;

import com.PA.Practica.Persistence.Entity.Role;
import com.PA.Practica.Persistence.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
