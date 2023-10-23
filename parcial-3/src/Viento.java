public class Viento extends Instrumento {

  public void tocar(Notas nota) {
    System.out.println("Viento toca: " + nota);
  }

  public String toString() {
    return ("Instrumento de tipo viento, afinacion: " + super.getAfinacion());
  }

}
