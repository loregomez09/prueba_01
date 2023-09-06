package com.example.prueba_01.Model;

import jakarta.persistence.*;
import lombok.Data;

//import javax.persistence.*;
@Data
@Entity
@Table(name ="desktop")
public class Desktop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_desktop;
    private String nombre;
    private String modelo;


}