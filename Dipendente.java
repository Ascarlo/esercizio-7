package marzo;
//7/3/2023
public class Dipendente extends Persona{
	
	private double Retribuzione;
	private int AnnoAssunzione;
	private String ID;
	
	public Dipendente() {
		
	}
	
	public Dipendente(String nome, double retribuzione, int annoAssunzione, String id) {
		
		super (nome);
		Retribuzione = retribuzione;
		AnnoAssunzione = annoAssunzione;
		ID = id;
	}

	public double getRetribuzione() {
		return Retribuzione;
	}

	public void setRetribuzione(double retribuzione) {
		Retribuzione = retribuzione;
	}

	public int getAnnoAssunzione() {
		return AnnoAssunzione;
	}

	public void setAnnoAssunzione(int annoAssunzione) {
		AnnoAssunzione = annoAssunzione;
	}

	public String getID() {
		return ID;
	}

	public void setID(String id) {
		ID = id;
	}

	public String toString() {
		return "Nome dipendente: " + getNome()
				+ "\nRetribuzione: " + Retribuzione
				+ "\nDataAssunzione: " + AnnoAssunzione
				+ "\nID: " + ID;
	}
	
	public boolean isEqual (Dipendente oggetto1) {
		
		if (haLoStessoNome(oggetto1)) {
			
			return true;
		}
		else {
			return false;
		}
	}
}