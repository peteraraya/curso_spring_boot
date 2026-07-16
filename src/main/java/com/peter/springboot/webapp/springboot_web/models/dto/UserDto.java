package com.peter.springboot.webapp.springboot_web.models.dto;

import com.peter.springboot.webapp.springboot_web.models.User;

/**
 * Data Transfer Object (DTO) para representar la respuesta con los datos de un usuario.
 * Se utiliza para transferir datos entre el controlador y la vista o el cliente.
 */
public class UserDto {

    /**
     * Título o mensaje a mostrar asociado al usuario.
     */
    private String title;

    /**
     * Objeto User que contiene la información detallada del usuario.
     */
    private User user;
    
    /**
     * Obtiene el título.
     * @return el título actual
     */
    public String getTitle() {
      return title;
    }

    /**
     * Establece el título.
     * @param title nuevo título a establecer
     */
    public void setTitle(String title) {
      this.title = title;
    }

    /**
     * Obtiene el usuario asociado.
     * @return el objeto User actual
     */
    public User getUser() {
      return user;
    }

    /**
     * Establece un nuevo usuario.
     * @param user objeto User a establecer
     */
    public void setUser(User user) {
      this.user = user;
    }
}
