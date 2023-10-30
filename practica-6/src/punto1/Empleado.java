package punto1;

public class Empleado extends Persona {
  private long legajo;
  private double sueldo;

  // getters and setters
  public long getLegajo() {
    return this.legajo;
  }

  public void setLegajo(long legajo) {
    this.legajo = legajo;
  }

  public double getSueldo() {
    return this.sueldo;
  }

  public void setSueldo(double sueldo) {
    this.sueldo = sueldo;
  }

  // constructors
  public Empleado() {
    super();
    this.legajo = 0;
    this.sueldo = 0.0;
  }

  public Empleado(String nombre, String apellido, int edad, long legajo, double sueldo) {
    super(nombre, apellido, edad);
    this.legajo = legajo;
    this.sueldo = sueldo;
  }

  // toString
  @Override
  public String toString() {
    return super.toString() + " " + this.legajo + " " + this.sueldo;
  }
}
