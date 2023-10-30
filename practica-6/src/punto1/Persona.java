import java.util.Comparator;

public class Persona implements Comparable<Persona>, Comparator<Persona> {
  private String nombre;
  private String apellido;
  private int edad;

  // getters & setters
  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return this.apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public int getEdad() {
    return this.edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  // constructors
  public Persona() {
    this.nombre = "";
    this.apellido = "";
    this.edad = 0;
  }

  public Persona(String nombre, String apellido, int edad) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
  }

  // comparable
  @Override
  public int compareTo(Persona otraPersona) {
    return this.nombre.compareTo(otraPersona.getNombre());
  }

  // comparator
  @Override
  public int compare(Persona p1, Persona p2) {
    if (!p1.getNombre().equals(p2.getNombre())) {
      return p1.getNombre().compareTo(p2.getNombre());
    } else if (!p1.getApellido().equals(p2.getApellido())) {
      return p1.getApellido().compareTo(p2.getApellido());
    } else {
      return p1.getEdad() - p2.getEdad();
    }
  }

  // toString
  @Override
  public String toString() {
    return this.nombre + " " + this.apellido + " " + this.edad;
  }

}
