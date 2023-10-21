
public class Rocoso extends Planeta{

	public void tipo() {
		System.out.println("bostero");
	}

	public Rocoso() {
		
	}

	public Rocoso(int lunas, float diametro, float distancia) {
		super.setLunas(lunas);
		super.setDiametro(diametro);
		super.setDistancia(distancia);
	}

	@Override
	public String toString() {
		return "tipo = Rocoso -> [lunas=" + super.getLunas() + ", diametro=" + super.getDiametro() + ", distancia=" + super.getDistancia() + "]";
	}
	
}
