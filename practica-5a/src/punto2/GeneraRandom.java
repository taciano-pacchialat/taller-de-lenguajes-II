package punto2;

final class GeneraRandom {
	
	private static final int MAXIMO_VALOR = 255;
	
	public static int obtenerRandom() {
		return ((int) Math.round(Math.random() * MAXIMO_VALOR));
	}
}
