package com.example.prueba_01.ImpService;
import com.example.prueba_01.Model.Desktop;

import java.util.List;
import java.util.Optional;

public interface IDesktopService {
    public List<Desktop> listar();
    public Optional<Desktop> editar(long id);
    public void guardar(Desktop desk);
    public void eliminar(long id);

    Desktop obtenerDesktopPorId(Long id_desktop);
}
