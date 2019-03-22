package pozoriste;

public class Predstava {
	

/*	Predstava je opisana nazivom, pozoristem u kojem se odrzava i sadrzi zadat broj zaposlenih 
	koji ucestvuju u realizaciji predstave. Moze da se dodaju zaposleni za realizaciju predstave.
	Moze da se dohvati naziv predstave, da se dohvati pozoriste u kojem se održava predstava i da se 
	sastavi tekstualni opis predstave navodeci naziv predstave i naziv pozorista u kojem se predstava
	odrzava razdvojene zarezom, a potom zaposlene koji ucestvuju u realizaciji predstave 
	(svakog zaposlenog u zasebnom redu).*/
	
	private String nazivPredstave;
	private Zaposleni[] zaposleni;
	private String pozoriste;
	
	public Predstava(String nazivPredstave, int k, String pozoriste) {
		this.nazivPredstave=nazivPredstave;
		zaposleni = new Zaposleni[k];
		this.pozoriste=pozoriste;
	}
	
	
	public String getNazivPredstave() {
		return nazivPredstave;
	}



	public Zaposleni[] getZaposleni() {
		return zaposleni;
	}



	public String getPozoriste() {
		return pozoriste;
	}



	public boolean dodajZaposlenog(Zaposleni z, int k) {
		if(k>=zaposleni.length || k < 0)
			if(zaposleni[k]!= null)
				return false;
			zaposleni[k] = z;
		return false;
	}
	
	/*sastavi tekstualni opis predstave navodeci naziv predstave i naziv pozorista u kojem se predstava
	odrzava razdvojene zarezom, a potom zaposlene koji ucestvuju u realizaciji predstave 
	(svakog zaposlenog u zasebnom redu).*/
	
	@Override
	public String toString () {
		StringBuilder sb = new StringBuilder (this.getNazivPredstave());
		sb.append(",").append(this.getPozoriste() + "\n");
		for(int i = 0; i < zaposleni.length; i++) {
			if(zaposleni[i]!=null)sb.append(zaposleni[i]+"\n");}
		return sb.toString();
	}
	
}
