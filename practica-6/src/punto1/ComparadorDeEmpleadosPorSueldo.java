import java.util.Comparator;

public class ComparadorDeEmpleadosPorSueldo implements Comparator<Empleado> {
  public int compare(Empleado e1, Empleado e2) {
    return Double.compare(e1.getSueldo(), e2.getSueldo());
  }
}
