package punto1;

import java.util.Comparator;

public class ComparadorDeEmpleados implements Comparator<Empleado> {
  public int compare(Empleado e1, Empleado e2) {
    int comparacion = e1.getNombre().compareTo(e2.getNombre());
    if (comparacion == 0) {
      comparacion = e1.getApellido().compareTo(e2.getApellido());
      if (comparacion == 0)
        comparacion = Double.compare(e1.getSueldo(), e2.getSueldo());
    }
    return comparacion;
  }
}
