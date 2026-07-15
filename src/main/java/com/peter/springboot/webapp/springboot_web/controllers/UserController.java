package com.peter.springboot.webapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controlador de Spring MVC que maneja las peticiones web para los usuarios.
 * Devuelve vistas HTML renderizadas por Thymeleaf.
 */
@Controller
public class UserController {
    
    /**
     * Endpoint que renderiza la vista de detalles del usuario.
     * Mapea a la ruta /details utilizando el método HTTP GET.
     * 
     * @param model Objeto Model utilizado para pasar datos a la vista.
     * @return El nombre de la plantilla Thymeleaf a renderizar ("details").
     */
    @GetMapping("/details")
    public String details(Model model) {
      // Se añaden atributos al modelo para que estén disponibles en la vista (Thymeleaf)
      model.addAttribute("title", "hola como estas");
      model.addAttribute("name", "Pedro");
      model.addAttribute("lastName", "Araya");
      
      // Retorna el nombre de la plantilla HTML ubicada en src/main/resources/templates/details.html
      return "details";
    }
}
