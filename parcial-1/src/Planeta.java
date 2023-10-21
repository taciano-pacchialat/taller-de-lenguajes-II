
public abstract class Planeta {
	
	protected int lunas;
	protected float diametro;
	protected float distancia;

	public float getDistancia() {
		return this.distancia;
	}
	 
	public int getLunas() {
		return lunas;
	}
	
	public void setLunas(int lunas) {
		this.lunas = lunas;
	}
	
	public float getDiametro() {
		return diametro;
	}

	public void setDiametro(float diametro) {
		this.diametro = diametro;
	}
	
	public void setDistancia(float distancia) {
		this.distancia = distancia;
	}
	
	public abstract void tipo();
	
	@Override
	public String toString() {
		return "Planeta [lunas=" + lunas + ", diametro=" + diametro + ", distancia=" + distancia + "]";
	}
}
