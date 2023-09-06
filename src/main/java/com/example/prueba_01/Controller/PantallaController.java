package com.example.prueba_01.Controller;

import com.example.prueba_01.ImpService.IPantallaService;
import com.example.prueba_01.Model.Pantalla;
import com.example.prueba_01.Service.PantallaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping
public class PantallaController {

    @Autowired
    private IPantallaService pantallaService;

    @GetMapping("/pantalla")
    public String listar(Model model) {
        model.addAttribute("titulo", "Pantalla");
        model.addAttribute("Cuerpo", "Pantalla");

        List<Pantalla> pantallas = pantallaService.listar();

        model.addAttribute("datos", pantallas);

        return "pantalla";
    }

    @GetMapping("/ingresoPantalla")
    public String formIngreso(Model model) {
        model.addAttribute("titulo", "Nueva Pantalla");
        model.addAttribute("cuerpo", "Ingreso");
        model.addAttribute("pantalla", new Pantalla());
        return "ingresoPantalla";
    }

    @PostMapping("/guardarPantalla")
    public String guardarPantalla(@ModelAttribute Pantalla pantalla) {
        pantallaService.guardar(pantalla);
        return "redirect:/pantalla";
    }

    @GetMapping("/editarPantalla/{id}")
    public String editarPantalla(@PathVariable("id") Long id, Model model) {
        model.addAttribute("pantalla", pantallaService.editar(id));
        return "nuevoPantalla";
    }

    @GetMapping("/eliminarPantalla/{id}")
    public String eliminarPantalla(@PathVariable("id") Long id, Model model) {
        pantallaService.eliminar(id);
        return "redirect:/pantalla";
    }



}
