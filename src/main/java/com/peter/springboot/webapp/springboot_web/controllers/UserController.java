package com.peter.springboot.webapp.springboot_web.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.peter.springboot.webapp.springboot_web.models.User;

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
      User user = new User("Pedro", "Araya");

      // Se añaden atributos al modelo para que estén disponibles en la vista (Thymeleaf)
      model.addAttribute("title", "hola como estas");
      model.addAttribute("user", user);

      
      // Retorna el nombre de la plantilla HTML ubicada en src/main/resources/templates/details.html
      return "details";
    }

  /**
   * Endpoint que renderiza la vista de listado de usuarios.
   * Mapea a la ruta /list.
   * Utiliza ModelMap, que es una alternativa a Model para pasar datos a la vista.
   */
  @GetMapping("/list")
  public String list(ModelMap model){
    model.addAttribute("title", "Listado de usuarios!!");
    return "list";
  }

  /**
   * El uso de @ModelAttribute a nivel de método permite que el valor retornado 
   * se añada automáticamente al modelo de todas las vistas (métodos) de este controlador.
   * En este caso, todas las vistas tendrán acceso a la variable "users" que contiene esta lista.
   * Es útil para datos comunes que se repiten en múltiples vistas (ej. menús, listas de países, etc).
   * 
   * @return Lista de usuarios.
   */
  @ModelAttribute("users")
  public List<User> usersModel(){
    return Arrays.asList(
        new User("Pedro", "Araya", "piteraraya@antiticblue.com"),
        new User("John", "Parra", "jparra@antiticblue.com"),
        new User("Benja", "Diaz"),
        new User("JP", "Leon"));
  }


}
