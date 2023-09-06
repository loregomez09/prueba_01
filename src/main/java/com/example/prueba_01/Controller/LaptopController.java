package com.example.prueba_01.Controller;

import com.example.prueba_01.ImpService.ILaptopService;
import com.example.prueba_01.Model.Laptop;
import com.example.prueba_01.Service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping
public class LaptopController {

    @Autowired
    private ILaptopService laptopService;

    @GetMapping("/laptop")
    public String listar(Model model) {
        model.addAttribute("titulo", "Laptop");
        model.addAttribute("cuerpo", "Laptop");

        List<Laptop> laptops = laptopService.listar();

        model.addAttribute("datos", laptops);

        return "laptop";
    }

    @GetMapping("/ingresoLaptop")
    public String formIngreso(Model model) {
        model.addAttribute("titulo", "Nueva Laptop");
        model.addAttribute("cuerpo", "Ingreso");
        model.addAttribute("laptop", new Laptop());
        return "ingresoLaptop";
    }

    @PostMapping("/guardarLaptop")
    public String guardarLaptop(@ModelAttribute Laptop laptop) {
        laptopService.guardar(laptop);
        return "redirect:/laptop";
    }

    @GetMapping("/editarLaptop/{id}")
    public String editarLaptop(@PathVariable("id") Long id, Model model) {
        model.addAttribute("laptop", laptopService.editar(id));
        return "nuevoLaptop";
    }

    @GetMapping("/eliminarLaptop/{id}")
    public String eliminarLaptop(@PathVariable("id") Long id, Model model) {
        laptopService.eliminar(id);
        return "redirect:/laptop";
    }


}
