package marzo;
import java.util.Scanner;
//7/3/2023
public class test_Dipendente {
	
	public static void main(String[] args) {
		
		Scanner x = new Scanner(System.in);
		Scanner y = new Scanner(System.in);
		
		String rifai;
		do {	
			
			//oggetto con nome, retribuzione, data assuntione e codice identificativo
			Dipendente oggetto1 = new Dipendente("Chesley Sullenberger", 40000, 1980, "73840");
			
			System.out.print("inserisci il nome del dipendente: ");
			String nome = y.nextLine();
			
			System.out.print("inserisci la retribuzione del dipendente: ");
			double retribuzione = x.nextDouble();
			
			System.out.print("inserisci la data d'assunzione del dipendente: ");
			int anno_assunzione = x.nextInt();
			
			System.out.print("inserisci il codice identificativo del dipendente: ");
			String id = y.nextLine();
			
			Dipendente oggetto2 = new Dipendente (nome, retribuzione, anno_assunzione, id);
			
			System.out.println("\n");
			System.out.println("dipendente 1:\n" + oggetto1.toString());
			System.out.println("\n");
			System.out.println("dipendente 2:\n" + oggetto2.toString());
			
			if (oggetto1.isEqual(oggetto2)) {
				System.out.println("\ni due dipendenti sono uguali");
			}
			else {
				System.out.println("\ni due dipendenti non sono uguali");
			}
			System.out.println("vuoi rifare?");
			rifai = y.nextLine();
			
		}while(rifai.equals("si"));
	}
}