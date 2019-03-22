package pozoriste;

public class PozoristeGlavni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pozoriste p = new Pozoriste("JDP");
		Reditelj r = new Reditelj("Dusan Kovacevic", "JDP");
		Predstava pr = new Predstava("Urnebesna Tragedija", 5, "JDP");
		Glumac g = new Glumac("Marko Janketic", "JDP");
		Kostimograf k = new Kostimograf("Janko Jankovic", "JDP");
		Predstava pr2 = new Predstava("Sitne lazi", 4, p.getNazivPozorista());
		System.out.println(pr2.toString());
		
		
		
		pr.dodajZaposlenog(r, 1);
		pr.dodajZaposlenog(g, 2);
		pr.dodajZaposlenog(k, 3);
		System.out.println(pr.toString());
		
	}

}
