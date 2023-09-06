package com.example.prueba_01.Service;

import com.example.prueba_01.ImpService.IAsignacionService;
import com.example.prueba_01.Interfaces.AsignacionRepository;
import com.example.prueba_01.Model.*;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Data
public class AsignacionService implements IAsignacionService {
/*
    public static Asignacion asignarRecursos(Persona persona, Desktop desktop, Pantalla pantalla, Laptop laptop) {
        // Lógica de asignación de recursos
        // Implementa aquí tu lógica de asignación de recursos según tus requisitos

        // Ejemplo de asignación de recursos
        Asignacion asignacion = new Asignacion();
        asignacion.setPersona(persona);
        asignacion.setDesktop(desktop);
        asignacion.setPantalla(pantalla);
        asignacion.setLaptop(laptop);

        // Puedes realizar cualquier otra operación necesaria para asignar los recursos

        return asignacion;
    }

    private List<Asignacion> asignaciones = new ArrayList<>();

    // Método para obtener la asignación por su ID
    public static Asignacion obtenerAsignacionPorId(Long id) {
        // Implementa aquí la lógica para obtener la asignación por su ID de la lista de asignaciones
        for (Asignacion asignacion : asignaciones) {
            if (asignacion.getId_asignacion().equals(id)) {
                return asignacion;
            }
        }
        return null; // Retorna null si no se encuentra la asignación
    }

    // Método para almacenar una asignación
    public Asignacion guardarAsignacion(Asignacion asignacion) {
        // Implementa aquí la lógica para guardar la asignación en la lista de asignaciones
        asignaciones.add(asignacion);
        return asignacion;
    }

    // Método para actualizar una asignación
    public static Asignacion actualizarAsignacion(Asignacion asignacion) {
        // Implementa aquí la lógica para actualizar la asignación en la lista de asignaciones
        // Puedes utilizar el ID de la asignación para buscarla en la lista y actualizar sus datos
        // Si tienes una fuente de datos externa, puedes considerar actualizarla también
        return asignacion;
    }

    // Método para eliminar una asignación
    public void eliminarAsignacion(Long id) {
        // Implementa aquí la lógica para eliminar la asignación de la lista de asignaciones
        // Puedes utilizar el ID de la asignación para buscarla en la lista y eliminarla
        // Si tienes una fuente de datos externa, puedes considerar eliminarla también
        Asignacion asignacion = obtenerAsignacionPorId(id);
        if (asignacion != null) {
            asignaciones.remove(asignacion);
        }
    }

    // Método para obtener todas las asignaciones
    public List<Asignacion> obtenerTodasAsignaciones() {
        // Implementa aquí la lógica para obtener todas las asignaciones de la lista
        return asignaciones;
    }


*/
    @Autowired
    private static AsignacionRepository dato0;
    //Logica
    @Override
    public List<Asignacion> listar() {
        return dato0.findAll();
    }


    @Override
    public Optional<Asignacion> editar(Long id) {
        return dato0.findById(id);
    }

    @Override
    public void guardar(Asignacion asig) {
        dato0.save(asig);

    }

    @Override
    public void eliminar(Long id) {
        dato0.deleteById(id);
    }


}