package com.example.prueba_01.Model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "asignacion")
public class Asignacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_asignacion;

    @OneToOne
    @JoinColumn(name = "id_pantalla")
    private Pantalla pantalla;

    @OneToOne
    @JoinColumn(name = "id_laptop")
    private Laptop laptop;

    @OneToOne
    @JoinColumn(name = "id_desktop")
    private Desktop desktop;



}