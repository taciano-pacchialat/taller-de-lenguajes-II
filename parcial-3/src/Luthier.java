public class Luthier {

  public Luthier() {
  }

  public void afinar(Instrumento instrumento) {
    if (instrumento.getClass().equals(Cuerdas.class))
      instrumento.afinar(Notas.DO);
    else if (instrumento.getClass().equals(Viento.class))
      instrumento.afinar(Notas.SI);
    else
      instrumento.afinar(Notas.RE);
  }
}
