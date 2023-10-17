package reinoanimal;

public class Gato extends Animal {
	@Override
	// no se puede reducir la visibilidad de un metodo heredado
	protected void saludo() {
		System.out.println("Miau!");
	}	
}
