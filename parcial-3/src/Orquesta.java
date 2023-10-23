import java.util.ArrayList;

public class Orquesta {

  private ArrayList<Instrumento> instrumentos;

  public Orquesta() {
    this.instrumentos = new ArrayList<Instrumento>();
  }

  public Orquesta(ArrayList<Instrumento> instrumentos) {
    this.instrumentos = instrumentos;
  }

  public void agregarInstrumento(Instrumento instrumento) {
    if (this.instrumentos.size() < 7)
      this.instrumentos.add(instrumento);
  }

  public void eliminarEn(int pos) {
    if ((pos >= 0) && (pos < 7) && (this.instrumentos.get(pos) != null)) {
      this.instrumentos.remove(pos);
    }
  }
}
