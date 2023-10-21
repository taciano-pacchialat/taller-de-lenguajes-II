import java.util.ArrayList;
public class SistemaSolar {
	
	private static SistemaSolar INSTANCE;
	private ArrayList<Planeta> planetas;
	
	private SistemaSolar() {
		this.planetas = new ArrayList<Planeta>();
	};
	
	public static SistemaSolar getInstance() {
		if (INSTANCE == null) 
			INSTANCE = new SistemaSolar();
		return INSTANCE;
	}

	public void addPlaneta(Planeta planeta) {
		this.planetas.add(planeta);
	}

	public void deletePlaneta(Planeta planeta) {
		this.planetas.remove(planeta);
	}

	public void printPlanetas() {
		for (Planeta planeta : this.planetas) {
			System.out.println(planeta);
		}
	}
	
}
