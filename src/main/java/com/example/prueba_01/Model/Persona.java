package com.example.prueba_01.Model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name="persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_persona;
    private String nombre;
    private String apellido;

    @OneToOne
    @JoinColumn(name = "id_asignacion")
    private Asignacion asignacion;


    public <E> List<E> getLaptops() {
        return null;
    }

    public <E> List getPantallas() {
        return null;
    }

    public <E> List getDesktops() {
        return null;
    }
}
