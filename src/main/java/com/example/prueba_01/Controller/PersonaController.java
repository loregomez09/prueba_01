package com.example.prueba_01.Controller;

import com.example.prueba_01.ImpService.IPersonaService;
import com.example.prueba_01.Model.Persona;
import com.example.prueba_01.Service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class PersonaController {

    @Autowired
    private IPersonaService personaService;

    @GetMapping("/persona")
    public String listar(Model model) {
        model.addAttribute("titulo", "Personas");
        model.addAttribute("Cuerpo", "Personas");

        List<Persona> personas = personaService.listar();
        model.addAttribute("datos", personas);

        return "persona";
    }

    @GetMapping("/ingresoPersona")
    public String formIngreso(Model model) {
        model.addAttribute("titulo", "Nueva Persona");
        model.addAttribute("cuerpo", "Ingreso");
        model.addAttribute("persona", new Persona());

        return "ingresoPersona";
    }

    @PostMapping("/guardarPersona")
    public String guardarPersona(@ModelAttribute Persona persona) {
        personaService.guardar(persona);
        return "redirect:/persona";
    }

    @GetMapping("/editarPersona/{id}")
    public String editarPersona(@PathVariable("id") Long id, Model model) {
        Optional<Persona> persona = personaService.editar(id);
        model.addAttribute("persona", persona);
        return "editarPersona";
    }

    @GetMapping("/eliminarPersona/{id}")
    public String eliminarPersona(@PathVariable("id") Long id) {
        personaService.eliminar(id);
        return "redirect:/persona";
    }


}
