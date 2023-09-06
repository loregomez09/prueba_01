package com.example.prueba_01.Controller;
import com.example.prueba_01.ImpService.IDesktopService;
import com.example.prueba_01.ImpService.ILaptopService;
import com.example.prueba_01.ImpService.IPantallaService;
import com.example.prueba_01.ImpService.IPersonaService;
import com.example.prueba_01.Model.Desktop;
import com.example.prueba_01.Model.Laptop;
import com.example.prueba_01.Model.Pantalla;
import com.example.prueba_01.Model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
//Lady Lorena Gomez Forero
//Juan Sebastian Calvo Torres
@Controller
@RequestMapping("/asignacion")
public class AsignacionController {

    @Autowired
    private IPersonaService personaService;

    @Autowired
    private ILaptopService laptopService;

    @Autowired
    private IPantallaService pantallaService;

    @Autowired
    private IDesktopService desktopService;

    @GetMapping
    public String formAsignacion(Model model) {
        // Obtén la lista de personas
        List<Persona> personas = personaService.listar();
        model.addAttribute("personas",personas);

        // Obtén la lista completa de laptops, pantallas y desktops
        List<Laptop> laptops = laptopService.listar();
        List<Pantalla> pantallas = pantallaService.listar();
        List<Desktop> desktops = desktopService.listar();
        model.addAttribute("laptops", laptops);
        model.addAttribute("pantallas", pantallas);
        model.addAttribute("desktops", desktops);

        return "asignacion";
    }

    @PostMapping
    public String asignarElementos(
            @RequestParam(name = "id_persona") Long idPersona,
            @RequestParam(name = "id_laptop", required = false) Long idLaptop,
            @RequestParam(name = "id_pantalla", required = false) Long idPantalla,
            @RequestParam(name = "id_desktop", required = false) Long idDesktop
    ) {
        // Obtén la persona por ID
        Persona persona = personaService.obtenerPersonaPorId(idPersona);

        // Asigna los elementos a la persona
        if (idLaptop != null) {
            Laptop laptop = laptopService.obtenerLaptopPorId(idLaptop);
            persona.getLaptops().add(laptop);
        }
        if (idPantalla != null) {
            Pantalla pantalla = pantallaService.obtenerPantallaPorId(idPantalla);
            persona.getPantallas().add(pantalla);
        }
        if (idDesktop != null) {
            Desktop desktop = desktopService.obtenerDesktopPorId(idDesktop);
            persona.getDesktops().add(desktop);
        }

        // Guarda los cambios en la base de datos
        personaService.guardar(persona);

        return "redirect:/asignacion";
    }
}