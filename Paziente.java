package marzo;

public class Paziente extends Persona{

	private String ID;
	
	public Paziente() {
		
	}
	public Paziente(String nome, String id) {
		super (nome);
		ID = id;
	}
	
	public String getID() {
		return ID;
	}
	public void setID(String id) {
		ID = id;
	}
	
	public String toString() {
		return "Nome: " + getNome() + "\nNumero identificativo: " + ID; 
	}
}
