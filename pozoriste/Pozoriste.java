package pozoriste;

public class Pozoriste {
	
/*	Pozoriste ima jednoznacan automatski generisan celobrojan identifikator i naziv koji mogu da se dohvate. 
	Moze da se sastavi tekstualni opis u obliku naziv[ident]. */
	
	public static int uid;
	private int id;
	private String nazivPozorista;
	
	public Pozoriste() {
		this.id=++uid;
		this.nazivPozorista="";
	}

	public Pozoriste(String nazivPozorista) {
		super();
		this.id =++uid;
		this.nazivPozorista = nazivPozorista;
	}

	public int getId() {
		return id;
	}

	public String getNazivPozorista() {
		return nazivPozorista;
	}
	
	@Override
	public String toString() {
		return this.getNazivPozorista() + "[" + this.getId() + "]";
	}

}
