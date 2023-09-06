package com.example.prueba_01.ImpService;
import com.example.prueba_01.Model.Pantalla;

import java.util.List;
import java.util.Optional;

public interface IPantallaService {
    public List<Pantalla> listar();
    public Optional<Pantalla> editar(Long id);
    public void guardar(Pantalla pan);
    public void eliminar(Long id);

    Pantalla obtenerPantallaPorId(Long id_pantalla);
}
