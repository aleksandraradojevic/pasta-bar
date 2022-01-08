package projekat_pasta_bar;

import java.util.Scanner;

public class PastaBar {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		String[] stalneMusterije = { "0601231231", "0611111111", "062222222", "063333333", "064444444", "065555555" };
		String[] sastojci = { "makarone", "spagete", "bolognese", "curetina", "govedja prsuta", "slanina", "piletina",
				"4 sira", "dimljeni sir", "parmezan", "pavlaka", "pesto sos", "napolitana", "povrce mix", "pecurke",
				"kutija" };
		int[] ceneProizvoda = { 50, 60, 120, 120, 140, 100, 100, 100, 80, 50, 80, 80, 80, 50, 50, 20 };
		double cena = 0;
		String imeSastojka = "";

		System.out.println("Izvolite !!!");

		while (!(imeSastojka.equals("poruci"))) {

			System.out.println("Unesite sastojak za pastu: ");
			imeSastojka = s.nextLine();
			int indeks = trazenjeSastojka(sastojci, imeSastojka);

			if (indeks >= 0) {

				cena = cena + ceneProizvoda[indeks];
			} else if (!imeSastojka.equals("poruci")) {

				System.out.println("Sastojak ne postoji! Unesite novi sastojak: ");
			}

		}

		System.out.println("Unesite vas broj telefona: ");

		String brojTelefona = s.next();

		System.out.println("Da li zelite kutiju? (da/ne)");
		String kutija = s.next();

		if (kutija.equals("da")) {

			cena = cena + ceneProizvoda[15];

		}

		if (jeStalnaMusterija(stalneMusterije, brojTelefona)) {

			System.out.println("Imate 10% popusta!");

			cena = cena * 0.9;

		}

		System.out.println("Vasa pasta iznosi: " + cena + " rsd.");
		System.out.println("Prijatno!!!");

	}

	public static int trazenjeSastojka(String[] sastojci, String imeSastojka) {

		for (int i = 0; i < sastojci.length; i++) {

			if (sastojci[i].equals(imeSastojka)) {

				return i;

			}

		}
		return -1;
	}

	public static boolean jeStalnaMusterija(String[] stalneMusterije, String brojTelefona) {

		boolean jeStalnaMusterija = false;

		for (int i = 0; i < stalneMusterije.length; i++) {

			if (stalneMusterije[i].equals(brojTelefona)) {

				jeStalnaMusterija = true;

			}

		}
		return jeStalnaMusterija;
	}

}
