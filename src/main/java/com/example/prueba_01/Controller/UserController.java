package com.example.prueba_01.Controller;

import com.example.prueba_01.Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    @PostMapping("/login")
    public String login(User user) {

        System.out.println("Nombre de usuario: " + user.getUsername());
        System.out.println("Contraseña: " + user.getPassword());

        return "redirect:/menu";
    }
}
