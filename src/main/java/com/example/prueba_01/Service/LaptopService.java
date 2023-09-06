package com.example.prueba_01.Service;


import com.example.prueba_01.ImpService.ILaptopService;
import com.example.prueba_01.Interfaces.LaptopRepository;
import com.example.prueba_01.Model.Asignacion;
import com.example.prueba_01.Model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LaptopService implements ILaptopService {

    @Autowired

    private LaptopRepository dato2;

    @Override
    public List<Laptop> listar() {
        return dato2.findAll();
    }


    @Override
    public Optional<Laptop> editar(Long id) {
        return dato2.findById(id);
    }

    @Override
    public void guardar(Laptop lap) {
        dato2.save(lap);

    }

    @Override
    public void eliminar(Long id) {
        dato2.deleteById(id);

    }

    @Override
    public Laptop obtenerLaptopPorId(Long id_Laptop) {
        return dato2.findById(id_Laptop).orElse(null);
    }


}
