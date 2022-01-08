package projekat_pasta_bar;

public class PastaBar {

	public static void main(String[] args) {

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
