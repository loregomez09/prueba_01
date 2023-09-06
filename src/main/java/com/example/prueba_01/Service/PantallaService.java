package com.example.prueba_01.Service;
import com.example.prueba_01.ImpService.IPantallaService;
import com.example.prueba_01.Interfaces.PantallaRepository;
import com.example.prueba_01.Model.Pantalla;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PantallaService implements IPantallaService {

    @Autowired
    private PantallaRepository dato3;
    //Logica
    @Override
    public List<Pantalla> listar() {
        return dato3.findAll();
    }


    @Override
    public Optional<Pantalla> editar(Long id) {
        return dato3.findById(id);
    }

    @Override
    public void guardar(Pantalla pan) {
        dato3.save(pan);

    }

    @Override
    public void eliminar(Long id) {
        dato3.deleteById(id);

    }

    @Override
    public Pantalla obtenerPantallaPorId(Long id_pantalla) {
        return dato3.findById(id_pantalla).orElse(null);
    }
}
