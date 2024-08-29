package helloworld;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String MonMot, Validation = "n";

		do {

			System.out.println(" ");
			System.out.println(" ");
			System.out.println("$-----------------------------------------------------------------------$ ");
			System.out.print("");
			System.out.print("Le Joueur 1 entrez votre Mot : ");
			MonMot = scanner.nextLine();
			MonMot = MonMot.replaceAll("\\s", "");
			System.out.println("votre mot est : " + MonMot);
			System.out.println("Constitué de " + MonMot.length() + " lettres");
			System.out.print("Appuyer sur " + '\'' + "n" + '\'' + " pour modifier votre mot sinon appuyer sur " + '\''
					+ "entrer" + '\'' + " ? ");
			Validation = scanner.nextLine();

		} while ((Validation.equals("n")));

		/* Validation de l'utilisateur */
		System.out.println("$-----------------------------------------------------------------------$ ");

		/* transformation en table de caractere */

		char[] Tab = MonMot.toCharArray();
//	for (char c : Tab) {
//        System.out.print(c);
//        System.out.print('\t');
//    }

		/* recherche dans le tableau */

		char Word;
		ArrayList<String> value = new ArrayList<String>();
		char[] Tampon = new char[MonMot.length()];
		for (int i = 0; i < MonMot.length(); i++)
			Tampon[i] = '_';

//	for (char k : Tampon) {
//        System.out.print(k);
//        System.out.print('\t');
//    }

//	ArrayList<int[]> indice = new ArrayList<int[]>();
		ArrayList<Integer> indice = new ArrayList<Integer>();

		System.out.print("Entrer vortre lettre : ");
		Word = scanner.next().charAt(0);
		int x = 0;

		for (int i = 0; i < MonMot.length(); i++) {
			if (Word == Tab[i]) {
				x++;
				indice.add(i + 1);
				Tampon[i] = Word;
			}

		}
		if (x <= 0)
			System.out.println("tu as ndem ");

		System.out.println("nous avonse donc : " + indice.toString());
		for (char k : Tampon) {
			System.out.print(k);
			System.out.print('\t');
		}

		/*
		 * if() { on part dans le tableau on recupere le caractere on met dans unee
		 * liste ou un pointeur
		 */

	}

}
