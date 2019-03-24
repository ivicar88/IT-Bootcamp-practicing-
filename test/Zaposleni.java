package test;

public abstract class Zaposleni {
	
	// Zaposleni u pozoristu je opisan imenom i pozoristem u kojem je zaposlen.
	// Svi podaci mogu da se dohvate. Moze da se dohvati jednoslovna oznaka vrste posla koju obavlja,
	// da se sastavi tekstualni opis u obliku ime[oznaka_posla,naziv_pozorista].
	// public abstract char getOznaka(); 
	
	private String imeZ;
	private Pozoriste pozoriste;
	
	public Zaposleni(String imeZ, Pozoriste pozoriste) {
		this.imeZ=imeZ;
		this.pozoriste=pozoriste;
	}

	public String getImeZ() {
		return imeZ;
	}

	public Pozoriste getPozoriste() {
		return pozoriste;
	}
	
	public abstract char getOznaka();

	@Override
	public String toString() {
		return getImeZ() + "[" + getOznaka() + "," + getPozoriste() + "]";
	}
	
	

}
