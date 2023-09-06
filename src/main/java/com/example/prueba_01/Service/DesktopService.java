package com.example.prueba_01.Service;

import com.example.prueba_01.ImpService.IDesktopService;
import com.example.prueba_01.Interfaces.DesktopRepository;
import com.example.prueba_01.Model.Desktop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DesktopService implements IDesktopService {

    @Autowired
    private DesktopRepository dato1;

    @Override
    public List<Desktop> listar() {
        return dato1.findAll();
    }

    @Override
    public Optional<Desktop> editar(long id) {
        return dato1.findById(id);
    }

    @Override
    public void guardar(Desktop desk) {
        dato1.save(desk);
    }

    @Override
    public void eliminar(long id) {
        dato1.deleteById(id);

    }
    @Override
    public Desktop obtenerDesktopPorId(Long id_desktop) {
        return dato1.findById(id_desktop).orElse(null);
    }


}
