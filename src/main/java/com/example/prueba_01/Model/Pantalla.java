package com.example.prueba_01.Model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "pantalla")
public class Pantalla {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_pantalla;
    private String nombre;
    private String modelo;


}