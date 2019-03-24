package test;

public class Predstava {
	
	// Predstava je opisana nazivom, pozoristem u kojem se odrzava i sadrzi zadat broj zaposlenih koji ucestvuju u realizaciji predstave. 
	// Moze da se dodaju zaposleni za realizaciju predstave. Moze da se dohvati naziv predstave, da se dohvati pozoriste u kojem se odrzava predstava i da se sastavi tekstualni opis predstave
	// navodeci naziv predstave i naziv pozorista u kojem se predstava odrzava razdvojene zarezom, a potom zaposlene koji ucestvuju u realizaciji predstave (svakog zaposlenog u zasebnom redu).
	
	private String nazivPred;
	private Pozoriste pozoriste;
	private Zaposleni[] zaposleni;
	public Predstava(String nazivPred, Pozoriste pozoriste, int z) {
		super();
		this.nazivPred = nazivPred;
		this.pozoriste = pozoriste;
		zaposleni = new Zaposleni[z];
	}
	public String getNazivPred() {
		return nazivPred;
	}
	public Pozoriste getPozoriste() {
		return pozoriste;
	}
	
	public boolean setZaposleni(Zaposleni z, int i) {
		if(i>=this.zaposleni.length || i<0) return false;
		if(zaposleni[i]!=null) return false;
		zaposleni[i]=z;
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder ("Naziv predstave: ").append(this.getNazivPred());
		sb.append(",").append(this.getPozoriste() + "\n");
		for(int i = 0; i<zaposleni.length;i++)
			if(zaposleni[i]!=null) sb.append(zaposleni[i] + "\n");
		return sb.toString();
	}

}
