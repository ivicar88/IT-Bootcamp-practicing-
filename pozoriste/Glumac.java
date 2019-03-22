package pozoriste;

public class Glumac extends Zaposleni{
	
	// Glumac, reditelj i kostimograf su zaposleni u pozoristu. Oznaka vrste posla je G, R i K, tim redom.*/

	public Glumac(String imeP, String pozoriste) {
		super(imeP, pozoriste);
	}

	@Override
	public char getOznakaPosla() {
		return 'G';
	}

}
