public class Cuerdas extends Instrumento {

  public void tocar(Notas nota) {
    System.out.println("Cuerdas toca: " + nota);
  }

  public String toString() {
    return ("Instrumento de tipo cuerdas, afinacion: " + super.afinacion);
  }

}
