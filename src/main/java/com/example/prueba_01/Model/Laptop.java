package com.example.prueba_01.Model;




import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "laptop")
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_laptop;
    private String nombre;
    private String modelo;



}