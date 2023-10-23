public class Percusion extends Instrumento {

  public void afinar(Notas nota) {
    super.afinacion = nota;
  }

  public void tocar(Notas nota) {
    System.out.println("Cuerdas toca: " + nota);
  }

  public String toString() {
    return ("Instrumento de tipo cuerdas, afinacion: " + super.afinacion);
  }
}
