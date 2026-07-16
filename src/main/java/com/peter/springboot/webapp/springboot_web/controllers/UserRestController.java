package com.peter.springboot.webapp.springboot_web.controllers;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.peter.springboot.webapp.springboot_web.models.User;

import java.util.HashMap;
import java.util.Map;

/**
 * Controlador REST que maneja las peticiones relacionadas con los usuarios.
 * Devuelve respuestas en formato JSON en lugar de vistas HTML.
 */
@RestController
@RequestMapping("/api")
public class UserRestController {
    
    /**
     * Endpoint que retorna los detalles de un usuario en formato JSON.
     * Mapea a la ruta /api/details utilizando el método HTTP GET.
     * 
     * @param model Objeto Model provisto por Spring (opcional en este contexto REST).
     * @return Map con la estructura de datos que será convertida a JSON.
     */
    @RequestMapping(path="/details", method = RequestMethod.GET)
    public Map<String, Object> details(Model model) {
      // Se utiliza un HashMap para estructurar la respuesta JSON
      Map<String, Object> body = new HashMap<>();
      User user = new User("Pedro", "Araya");
      
      // Agregando atributos al cuerpo de la respuesta
      body.put("title", "hola como estas");
      body.put("user",user);
      
      // Retorna el mapa, que Spring convertirá automáticamente a formato JSON
      return body;
    }
}
