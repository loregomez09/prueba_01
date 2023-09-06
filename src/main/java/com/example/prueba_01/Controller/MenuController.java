package com.example.prueba_01.Controller;

import com.example.prueba_01.Model.Menu;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
@Controller
public class MenuController {
    @GetMapping("/menu")
    public String mostrarMenu(Model model) {
        List<Menu> menuItems = new ArrayList<>();
        menuItems.add(new Menu("Inicio", "/"));
        menuItems.add(new Menu("Laptop", "/laptop"));
        menuItems.add(new Menu("Desktop", "/desktop"));
        menuItems.add(new Menu("Pantalla", "/pantalla"));
        menuItems.add(new Menu("Persona", "/persona"));

        model.addAttribute("menuItems", menuItems);

        return "menu";
    }
}
