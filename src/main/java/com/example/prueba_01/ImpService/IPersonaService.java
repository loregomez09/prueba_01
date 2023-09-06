package com.example.prueba_01.ImpService;

import com.example.prueba_01.Model.Persona;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface IPersonaService {
    public List<Persona> listar();
    public Optional<Persona> editar(Long id);
    public void guardar(Persona per);
    public void eliminar(Long id);

    Persona obtenerPersonaPorId(Long personaId);
}
