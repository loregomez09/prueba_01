package com.example.prueba_01.Interfaces;

import com.example.prueba_01.Model.Pantalla;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PantallaRepository extends JpaRepository<Pantalla, Long> {
}

