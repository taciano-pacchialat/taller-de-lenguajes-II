package punto2;

class TestCharly {
	public static void main(String[] args) {
		CharlyGarcia charly = CharlyGarcia.getInstance();
		charly.cantar();
		CharlyGarcia garca = CharlyGarcia.getInstance();
		// misma instancia? Si.
		System.out.println(charly == garca);
	}
}
