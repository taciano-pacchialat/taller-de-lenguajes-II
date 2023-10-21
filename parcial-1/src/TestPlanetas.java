public class TestPlanetas {
	public static void main(String[] args) {
		SistemaSolar sistemaSolar = SistemaSolar.getInstance();
		Planeta tierra = new Rocoso(1, (float) 50.5, (float) 4.0);
		Planeta marte = new Rocoso(2, (float) 30.5, (float) 3.0);
		Planeta jupiter = new Gaseoso(3, (float) 60.5, (float) 5.0);
		Planeta saturno = new Gaseoso(4, (float) 70.5, (float) 6.0);
		sistemaSolar.addPlaneta(tierra);
		sistemaSolar.addPlaneta(marte);
		sistemaSolar.addPlaneta(jupiter);
		sistemaSolar.addPlaneta(saturno);
		sistemaSolar.printPlanetas();
	}
}
