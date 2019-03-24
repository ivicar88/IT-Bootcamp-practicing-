package test;

public class Pozoriste {
	
	// Pozoriste ima jednoznacan automatski generisan celobrojan identifikator i naziv koji mogu da se dohvate. Moze da se sastavi tekstualni opis u obliku naziv[ident]. 
	
	public static int uid=0;
	private int id;
	private String nazivP;
	
	// default constructor
	public Pozoriste() {
		super();
		this.id=++uid;
		this.nazivP="";
	}
	
	// all atributes constructor
	public Pozoriste(String nazivP) {
		super();
		this.id=++uid;
		this.nazivP=nazivP;
	}

	public int getId() {
		return id;
	}

	public String getNazivP() {
		return nazivP;
	}

	@Override
	public String toString() {
		return this.getNazivP() + "[" + this.getId() + "]";
	}
	
	

}
