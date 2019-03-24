package test;

public class Premijera {

	public static void main(String[] args) {
	
	Pozoriste p = new Pozoriste("JDK");
	Reditelj r = new Reditelj("Dusan Kovacevic", p);
	Glumac g = new Glumac("Bogdan Diklic", p);
	Kostimograf k = new Kostimograf ("Branko Mamula", p);
	Predstava pr = new Predstava("Profesionalac", p, 6);
	pr.setZaposleni(r, 1);
	pr.setZaposleni(g, 2);
	pr.setZaposleni(k, 3);
	
	System.out.println(pr.toString());
	

	}

}
