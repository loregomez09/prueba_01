package com.example.prueba_01.ImpService;

import com.example.prueba_01.Model.Asignacion;
import com.example.prueba_01.Model.Laptop;

import java.util.List;
import java.util.Optional;

public interface ILaptopService {
    public List<Laptop> listar();
    public Optional<Laptop> editar(Long id);
    public void guardar(Laptop lap);
    public void eliminar(Long id);

    Laptop obtenerLaptopPorId(Long idLaptop);
}
