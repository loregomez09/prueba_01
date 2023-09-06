package com.example.prueba_01.Interfaces;

import com.example.prueba_01.Model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
