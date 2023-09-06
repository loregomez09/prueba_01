package com.example.prueba_01.Service;

import com.example.prueba_01.ImpService.IPersonaService;
import com.example.prueba_01.Interfaces.PersonaRepository;
import com.example.prueba_01.Model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService implements IPersonaService {


    @Autowired
    private PersonaRepository dato4;
    @Override
    public List<Persona> listar() {
        return dato4.findAll();
    }

    @Override
    public Optional<Persona> editar(Long id) {
        return dato4.findById(id);
    }

    @Override
    public void guardar(Persona per) {
        dato4.save(per);

    }

    @Override
    public void eliminar(Long id) {
        dato4.deleteById(id);

    }

    @Override
    public Persona obtenerPersonaPorId(Long personaId) {
        return null;
    }
}
