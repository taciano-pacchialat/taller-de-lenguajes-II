
public class Gaseoso extends Planeta {
	
	public Gaseoso() {
		
	}
	
	public Gaseoso(int lunas, float diametro, float distancia) {
		super.setLunas(lunas);
		super.setDiametro(diametro);
		super.setDistancia(distancia);
	}
	
	public void tipo() {
		System.out.println("pedo");
	}

	@Override
	public String toString() {
		return "tipo = Gaseoso -> [lunas=" + super.getLunas() + ", diametro=" + super.getDiametro() + ", distancia=" + super.getDistancia() + "]";
	}
	
}
