package pozoriste;

public abstract class Zaposleni {
	
/*	Zaposleni u pozorištu je opisan imenom i pozorištem u kojem je zaposlen.
	Svi podaci mogu da se dohvate. Moze da se dohvati jednoslovna oznaka vrste posla koju obavlja,
	da se sastavi tekstualni opis u obliku ime[oznaka_posla,naziv_pozorista].
	Glumac, reditelj i kostimograf su zaposleni u pozoristu. Oznaka vrste posla je G, R i K, tim redom.*/
	
	private String imeP;
	private String pozoriste;
	
	
	public Zaposleni(String imeP, String pozoriste) {
		this.imeP = imeP;
		this.pozoriste = pozoriste;
	}

	public String getImeP() {
		return imeP;
	}

	public String getPozoriste() {
		return pozoriste;
	}

	public abstract char getOznakaPosla();
	
	@Override
	public String toString() {
		return this.getImeP() + "[" + this.getOznakaPosla() + "," + this.getPozoriste() + "]";
	}

	

}


