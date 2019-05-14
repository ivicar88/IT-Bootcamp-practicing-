package biciklizam;

import java.util.Scanner;

public class Glavni {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ime, vbicikle;
		
		System.out.println("Unesite ime i prezime ");
		ime = sc.nextLine();
		System.out.println("Unesite vrstu bicikle ");
		vbicikle = sc.nextLine();

		Biciklista b = new Biciklista(ime, vbicikle);
		
		RutaGradovi.Ruta();
		System.out.println(b.toString());
		
		
		

	}

}
