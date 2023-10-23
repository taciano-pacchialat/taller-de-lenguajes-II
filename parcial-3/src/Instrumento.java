public abstract class Instrumento {

  private Notas afinacion;

  protected Notas getAfinacion() {
    return afinacion;
  }

  public void afinar(Notas nota) {
    this.afinacion = nota;
  }

  public abstract void tocar(Notas nota);

}
