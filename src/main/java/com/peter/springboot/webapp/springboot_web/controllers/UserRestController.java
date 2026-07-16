package com.peter.springboot.webapp.springboot_web.controllers;


import com.peter.springboot.webapp.springboot_web.SpringbootWebApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.peter.springboot.webapp.springboot_web.models.User;
import com.peter.springboot.webapp.springboot_web.models.dto.UserDto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * Controlador REST que maneja las peticiones relacionadas con los usuarios.
 * Devuelve respuestas en formato JSON en lugar de vistas HTML.
 */
@RestController
@RequestMapping("/api")
public class UserRestController {
    
    private final SpringbootWebApplication springbootWebApplication;

    /**
     * Constructor para inyección de dependencias.
     * 
     * @param springbootWebApplication Instancia de la aplicación principal.
     */
    UserRestController(SpringbootWebApplication springbootWebApplication) {
      this.springbootWebApplication = springbootWebApplication;
    }

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
     * Endpoint que proporciona una lista de usuarios.
     * Mapea a la ruta /api/list utilizando el método HTTP GET.
     * 
     * @return Lista de objetos User que se convertirá automáticamente a formato JSON.
     */
    @GetMapping("/list")
    public List<User> list() {
        User user = new User("Pedro", "Araya");
        User user2 = new User("John", "Parra");
        User user3 = new User("Benja", "Diaz");
        User user4 = new User("Juan Pablo", "Leon");

        // HelperspringbootWebApplication
        List<User> users = Arrays.asList(user,user2,user3,user4);

        // List<User> users = new ArrayList<>();

        // users.add(user);
        // users.add(user2);
        // users.add(user3);
        // users.add(user4);

        return users;
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
