package marzo;

public class CalcoloPagamento {

	private double Tariffa;
	private int Ore;
	private Dottore Medico;
	
	public CalcoloPagamento() {
		
	}
	public CalcoloPagamento(int ore, Dottore medico) {
		Medico = medico;
		Tariffa = Medico.getParcella();
		Ore = ore;
	}
	
	public double getTariffa() {
		return Tariffa;
	}
	public void setTariffa(double tariffa) {
		Tariffa = tariffa;
	}

	public String toString() {
		return "Tariffa:" + Tariffa;
	}
	
	public double calcolaPagamento() {
		
		return Medico.getParcella()*Ore;
	}	
}