package marzo;

public class Dottore extends Persona{

	private String Specializzazione;
	private double Parcella;
	
	public Dottore() {
		
	}
	public Dottore(String nome, String specializzazione, double parcella) {
		super (nome);
		Specializzazione = specializzazione;
		Parcella = parcella;
	}
	
	public String getSpecializzazione() {
		return Specializzazione;
	}
	public void setSpecializzazione(String specializzazione) {
		Specializzazione = specializzazione;
	}
	public double getParcella() {
		return Parcella;
	}
	public void setParcella(double parcella) {
		Parcella = parcella;
	}
	
	public String toString() {
		return "Nome: " + getNome() + "\nSpecializzazione: " + Specializzazione + "\nParcella: " + Parcella;
	}
	
	public boolean isEqual(Dottore oggetto1) {
		
		if (haLoStessoNome(oggetto1)) {
			return true;
		}
		return false;
	}
}
