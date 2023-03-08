package marzo;
import java.util.Scanner;
public class test_esercizio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner x = new Scanner(System.in);
		Scanner y = new Scanner(System.in);
		
		System.out.print("inserisci il nome del dottore: ");
		String nome = y.nextLine();
		
		System.out.print("inserisci la specializzazione del dottore: ");
		String specializzazione = y.nextLine();
		
		System.out.print("inserisci la parcella del dottore: ");
		double parcella = x.nextDouble();
		
		Dottore Medico = new Dottore (nome, specializzazione, parcella);
		
		double fatturaTotale = 0;
		
		System.out.print("inserisci il numero di pazienti: ");
		for (int i = 0; i <= x.nextInt(); i++) {
			
			System.out.print("inserisci il nome del paziente: ");
			nome =y.nextLine();
			
			System.out.print("inserisci il numero identificativo del paziente: ");
			String id = y.nextLine();
			
			Paziente Paziente = new Paziente (nome, id);
			
			System.out.print("inserisci il numero di ore: ");
			int ore = x.nextInt();
			
			CalcoloPagamento Calcolo = new CalcoloPagamento (ore, Medico);
			
			Fattura Pagamento = new Fattura(Paziente, Medico, Calcolo);
			System.out.println("\n" + Pagamento.toString());
			
			fatturaTotale += Calcolo.calcolaPagamento();
			System.out.println("\n");
		}
		
		System.out.println("la fattura totale del dottore: " + Medico.getNome() + " è di: " +  fatturaTotale);
	}
}