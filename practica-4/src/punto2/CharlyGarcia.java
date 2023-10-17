package punto2;

// lazy implementation
class CharlyGarcia {
	private CharlyGarcia() {};
	private static CharlyGarcia INSTANCE;
	
	public static CharlyGarcia getInstance() {
		if (INSTANCE == null)
			INSTANCE = new CharlyGarcia();
		return INSTANCE;
	}
	
	void cantar() {
		System.out.println("Yo pienso que vos sos un pelotudo");
	}
}
