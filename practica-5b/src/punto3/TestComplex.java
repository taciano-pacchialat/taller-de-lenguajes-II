package punto3;

public class TestComplex {
	public static void main(String[] args) {
		Complex c = new Complex (3, 4);
		Complex c2 = new Complex(1, 1);
		System.out.println(c.add(c2).toString());
		System.out.println(c.subtract(c2).toString());
	}
	
}
