package com.example.prueba_01.ImpService;

import com.example.prueba_01.Model.Asignacion;

import java.util.List;
import java.util.Optional;

public interface IAsignacionService {
    public List<Asignacion> listar();
    public Optional<Asignacion> editar(Long id);
    public void guardar(Asignacion asig);
    public void eliminar(Long id);
}
