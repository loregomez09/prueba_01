package com.example.prueba_01.Controller;

import com.example.prueba_01.ImpService.IDesktopService;
import com.example.prueba_01.Model.Desktop;
import com.example.prueba_01.Service.DesktopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping
public class DesktopController {

    @Autowired
    private IDesktopService desktopService;

    @GetMapping("/desktop")
    public String listar(Model model) {


        model.addAttribute("titulo", "Desktop");
        model.addAttribute("Cuerpo", "Desk");

        List<Desktop> deskt = desktopService.listar();

        model.addAttribute("datos", deskt);


        return "desktop";

    }
    @GetMapping("/ingresoDesktop")
    public String formIngreso(Model model) {

        model.addAttribute("titulo","Nuevo Desktop");
        model.addAttribute("cuerpo","Ingreso");
        model.addAttribute("Desktop", new Desktop());
        return "ingreso";
    }
    @PostMapping("/guardar")
    public String guardarDesktop(@ModelAttribute Desktop des){

        desktopService.guardar(des);

        return "redirect:/desktop";
    }
    @GetMapping("/editar/{id}")
    public String editarDesktop(@PathVariable("id")Long id, Model model){

        // Optional<Persona> per= serv.editar(id);


        model.addAttribute("Desktop",desktopService.editar(id));

        return "nuevo";
    }
    @GetMapping("/eliminar/{id}")
    public String eliminarDesktop(@PathVariable("id")Long id, Model model){

        // Optional<Persona> per= serv.editar(id);
        desktopService.eliminar(id);



        return "redirect:/desktop";
    }


}
