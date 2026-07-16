package com.peter.springboot.webapp.springboot_web.models;

/**
 * Clase de modelo que representa a un usuario en el sistema.
 */
public class User {

  private String name;
  private String lastName;
  private String email; 

  /**
   * Constructor vacío por defecto.
   * Es una buena práctica, y a menudo requerido por frameworks (como JPA o Spring),
   * tener un constructor sin argumentos para poder instanciar el objeto.
   */
  public User(){}
  
  /**
   * Constructor que incluye todos los campos, incluyendo el nuevo campo email.
   * Utiliza this(name, lastName) para reutilizar el constructor de dos parámetros,
   * lo que ayuda a evitar código duplicado (principio DRY).
   */
  public User(String name, String lastName, String email) {
    this(name,lastName); // Llama al constructor de 2 parámetros de esta misma clase
    this.email = email;
  }

  /**
   * Constructor con nombre y apellido (email será null por defecto).
   * Útil cuando no todos los usuarios tienen un email registrado.
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

  /**
   * Obtiene el email del usuario.
   * @return email
   */
  public String getEmail() {
    return email;
  }

  /**
   * Establece el email del usuario.
   * @param email
   */
  public void setEmail(String email) {
    this.email = email;
  }
}
