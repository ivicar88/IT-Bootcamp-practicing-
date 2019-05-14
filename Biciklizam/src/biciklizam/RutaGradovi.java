package biciklizam;

import java.util.Scanner;

public class RutaGradovi {

	public static void Ruta() {
		Scanner sc = new Scanner(System.in);
		int BeogradNoviSad = 78;
		int BeogradNis = 235;
		int NisNoviSad = 311;
		int NisBeograd = 235;
		int NoviSadBeograd = 78;
		int NoviSadNis = 311;
		int Pozicija;
		int Predjeno = 0;

		System.out.println("Odaberite grad: Beograd, Novi Sad ili Nis: ");
		Pozicija = sc.nextInt();
		if (Pozicija == 1) {
			// Beograd
			System.out.println("Odaberite grad: Novi Sad ili Nis: ");
			int b;
			b = sc.nextInt();
			if (b == 1) {
				// BeogradNoviSad
				while (BeogradNoviSad > 0) {
					System.out.println("Do Novog Sada je potrebno preci "
							+ BeogradNoviSad + "km");
					System.out.println("Unesite predjeni broj kilometara");
					int c;
					c = sc.nextInt();
					if (c == BeogradNoviSad) {
						System.out.println("Stigli ste na destinaciju!");
						break;
					} else if (c < 0 || c > BeogradNoviSad) {
						System.out
								.println("Uneti broj kilometara mora biti veci ili jednak nuli ili manji od "
										+ BeogradNoviSad);
					}

					else {
						BeogradNoviSad -= c;
						Predjeno += c;
						System.out.println("Presli ste " + Predjeno
								+ " km. Ostalo vam je jos " + BeogradNoviSad
								+ "km do Novog Sada");
					}
				}

			} else {
				// BeogradNis
				while (BeogradNis > 0) {
					System.out.println("Do Nisa je potrebno preci "
							+ BeogradNis + "km");
					System.out.println("Unesite predjeni broj kilometara");
					int c;
					c = sc.nextInt();
					if (c == BeogradNis) {
						System.out.println("Stigli ste na destinaciju!");
						break;
					} else if (c < 0 || c > BeogradNis) {
						System.out
								.println("Uneti broj kilometara mora biti veci ili jednak nuli ili manji od "
										+ BeogradNis);
					}

					else {
						BeogradNis -= c;
						Predjeno += c;
						System.out.println("Presli ste " + Predjeno
								+ " km. Ostalo vam je jos " + BeogradNis
								+ "km do Nisa");
					}
				}
			}
		} else if (Pozicija == 2) {
			// Novi Sad
			System.out.println("Odaberite grad: Beograd ili Nis: ");
			int b;
			b = sc.nextInt();
			if (b == 1) {
				// NoviSadBeograd
				while (NoviSadBeograd > 0) {
					System.out.println("Do Beograda je potrebno preci "
							+ NoviSadBeograd + "km");
					System.out.println("Unesite predjeni broj kilometara");
					int c;
					c = sc.nextInt();
					if (c == NoviSadBeograd) {
						System.out.println("Stigli ste na destinaciju!");
						break;
					} else if (c < 0 || c > NoviSadBeograd) {
						System.out
								.println("Uneti broj kilometara mora biti veci ili jednak nuli ili manji od "
										+ NoviSadBeograd);
					}

					else {
						NoviSadBeograd -= c;
						Predjeno += c;
						System.out.println("Presli ste " + Predjeno
								+ " km.  Ostalo vam je jos " + NoviSadBeograd
								+ "km do Beograda");
					}
				}
			} else {
				// NoviSadNis
				while (NoviSadNis > 0) {
					System.out.println("Do Nisa je potrebno preci "
							+ NoviSadNis + "km");
					System.out.println("Unesite predjeni broj kilometara");
					int c;
					c = sc.nextInt();
					if (c == NoviSadNis) {
						System.out.println("Stigli ste na destinaciju!");
						break;
					} else if (c < 0 || c > NoviSadNis) {
						System.out
								.println("Uneti broj kilometara mora biti veci ili jednak nuli ili manji od "
										+ NoviSadNis);
					}

					else {
						NoviSadNis -= c;
						Predjeno += c;
						System.out.println("Presli ste " + Predjeno
								+ " km. Ostalo vam je jos " + NoviSadNis
								+ "km do Nisa");
					}
				}
			}
		} else if (Pozicija == 3) {
			// Nis
			System.out.println("Odaberite grad: Beograd ili Novi Sad: ");
			int b;
			b = sc.nextInt();
			if (b == 1) {
				// NisBeograd
				while (NoviSadNis > 0) {
					System.out.println("Do Beograda je potrebno preci "
							+ NisBeograd + "km");
					System.out.println("Unesite predjeni broj kilometara");
					int c;
					c = sc.nextInt();
					if (c == NisBeograd) {
						System.out.println("Stigli ste na destinaciju!");
						break;
					} else if (c < 0 || c > NisBeograd) {
						System.out
								.println("Uneti broj kilometara mora biti veci ili jednak nuli ili manji od "
										+ NisBeograd);
					}

					else {
						NisBeograd -= c;
						Predjeno += c;
						System.out.println("Presli ste " + Predjeno
								+ " km. Ostalo vam je jos " + NisBeograd
								+ "km do Beograda");
					}
				}
			} else {
				// NisNoviSad
				while (NisNoviSad > 0) {
					System.out.println("Do Novog Sada je potrebno preci "
							+ NisBeograd + "km");
					System.out.println("Unesite predjeni broj kilometara");
					int c;
					c = sc.nextInt();
					if (c == NisBeograd) {
						System.out.println("Stigli ste na destinaciju!");
						break;
					} else if (c < 0 || c > NisBeograd) {
						System.out
								.println("Uneti broj kilometara mora biti veci ili jednak nuli ili manji od "
										+ NisBeograd);
					}

					else {
						NisBeograd -= c;
						Predjeno += c;
						System.out.println("Presli ste " + Predjeno
								+ " km. Ostalo vam je jos " + NisBeograd
								+ "km do NovogSada");
					}
				}
			}
		} else {
			System.out.println("Uneseni grad ne postoji");
		}

	}
}
