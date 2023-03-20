package com.example.demo.controladors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Controlador principal del projecte
 * Implementa un senzill mapping GET, amb paràmetre opcional.
 * Reducciona a la vista salutacio de ThymeLeaf
 *
 * @author sergi.grau@fje.edu
 * @version 1.0 24.02.21
 */
@Controller
public class M0_IndexController {
    @GetMapping("/salutacio")
    public String salutar(
            @RequestParam(defaultValue = "sergi", required = false) String nom,
            Model model) {
        model.addAttribute("usuari", nom);
        return "salutacio";
    }
}
