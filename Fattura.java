package marzo;
import java.util.Scanner;
public class Fattura {
	
	private Paziente Paziente;
	private Dottore Dottore;
	private CalcoloPagamento Pagamento; 

	public Fattura() {
		
	}
	public Fattura(Paziente paziente, Dottore dottore, CalcoloPagamento pagamento) {
		
		Paziente = paziente;
		Dottore = dottore;
		Pagamento = pagamento;
	}
	
	public Dottore getDottore() {
		return Dottore;
	}
	public Paziente getPaziente() {
		return Paziente;
	}
	
	public String toString() {
		return "Dottore: " + Dottore.getNome() + "\nSpecializzazione: " + Dottore.getSpecializzazione() 
		+ "\nParcella: " + Dottore.getParcella() + " €"
		+ "\nPaziente: " + Paziente.getNome() + "\nCodice paziente: " + Paziente.getID()
		+ "\nFattura equivalente a: " + Pagamento.calcolaPagamento() + " €";
	}
}