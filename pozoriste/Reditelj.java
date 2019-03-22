package pozoriste;

public class Reditelj extends Zaposleni{

	public Reditelj(String imeP, String pozoriste) {
		super(imeP, pozoriste);
		
	}

	@Override
	public char getOznakaPosla() {
		return 'R';
	}

}
