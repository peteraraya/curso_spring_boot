package com.peter.springboot.webapp.springboot_web.controllers;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.peter.springboot.webapp.springboot_web.models.User;
import com.peter.springboot.webapp.springboot_web.models.dto.UserDto;

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
     * Endpoint que proporciona los detalles del usuario utilizando un DTO.
     * Mapea a la ruta /api/details utilizando el método HTTP GET.
     * Al estar en un @RestController, la respuesta se serializa a JSON.
     * 
     * @return Objeto UserDto con los datos del usuario.
     */
    @GetMapping("/details")
    public UserDto details() {
      
      User user = new User("Pedro", "Araya");
      UserDto userDto = new UserDto();
      userDto.setUser(user);
      userDto.setTitle("hola como estas");

      // Retorna el objeto UserDto que Spring convertirá automáticamente a formato JSON
      return userDto;
    }

    /**
     * Endpoint que proporciona los detalles de un usuario utilizando un Map.
     * Mapea a la ruta /api/details-map utilizando el método HTTP GET.
     * Al estar en un @RestController, la respuesta se serializa a JSON.
     * 
     * @param model Objeto Model provisto por Spring (opcional en este contexto REST).
     * @return Map con la estructura de datos que será convertida a JSON.
     */
    @RequestMapping(path="/details-map", method = RequestMethod.GET)
    public Map<String, Object> detailsMap(Model model) {
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
