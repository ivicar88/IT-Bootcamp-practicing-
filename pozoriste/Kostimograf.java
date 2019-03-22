package pozoriste;

public class Kostimograf extends Zaposleni{

	public Kostimograf(String imeP, String pozoriste) {
		super(imeP, pozoriste);
		// TODO Auto-generated constructor stub
	}

	@Override
	public char getOznakaPosla() {
		return 'K';
	}

}
