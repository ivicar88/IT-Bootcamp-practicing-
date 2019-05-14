package biciklizam;

public class Biciklista {

	public static int id = 0;

	private String imePrezime;
	private String vrstaBicikliste;
	private int regBroj;
	private String startniGrad;
	private String ciljGrad;

	public Biciklista(String imePrezime, String vrstaBicikliste) {
		super();
		this.imePrezime = imePrezime;
		this.vrstaBicikliste = vrstaBicikliste;
		this.regBroj = ++id;
		this.startniGrad = "";
		this.ciljGrad = "";
	}

	public String getCiljGrad() {
		return ciljGrad;
	}

	public void setCiljGrad(String ciljGrad) {
		this.ciljGrad = ciljGrad;
	}

	public String getVrstaBicikliste() {
		return vrstaBicikliste;
	}

	public void setVrstaBicikliste(String vrstaBicikliste) {
		this.vrstaBicikliste = vrstaBicikliste;
	}

	public String getStartniGrad() {
		return startniGrad;
	}

	public void setStartniGrad(String startniGrad) {
		this.startniGrad = startniGrad;
	}

	public String getImePrezime() {
		return imePrezime;
	}


	@Override
	public String toString() {
		return "Biciklista [" + this.imePrezime + "," + this.vrstaBicikliste
				+ "," + this.regBroj + "," + this.startniGrad + "]";
	}

}
