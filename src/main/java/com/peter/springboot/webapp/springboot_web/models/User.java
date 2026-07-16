package com.peter.springboot.webapp.springboot_web.models;

/**
 * Clase de modelo que representa a un usuario en el sistema.
 */
public class User {

  private String name;
  private String lastName;

  /**
   * Constructor con parámetros.
   * 
   * @param name     Nombre del usuario.
   * @param lastName Apellido del usuario.
   */
  public User(String name, String lastName) {
    this.name = name;
    this.lastName = lastName;
  }

  /**
   * Obtiene el nombre del usuario.
   * @return name
   */
  public String getName() {
    return name;
  }

  /**
   * Establece el nombre del usuario.
   * @param name
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Obtiene el apellido del usuario.
   * @return lastName
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * Establece el apellido del usuario.
   * @param lastName
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
}
