package reinoanimal;

public class Perro extends Animal {
	@Override
	// no se puede reducir la visibilidad de un metodo heredado
	protected void saludo() {
		System.out.println("Guau!");
}