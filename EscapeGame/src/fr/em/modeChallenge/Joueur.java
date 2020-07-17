package fr.em.modeChallenge;

import java.util.Scanner;

import fr.em.Game.Game;

public class Joueur extends Game {

	private int[] proposition;

	String str;
	boolean isNumber;
	Scanner input = new Scanner(System.in);

	// constructeur de default
	public Joueur() {
		proposition = new int[getSize()];
	}

	// Method proposer un numéro de 4 chiffres
	public int[] ProposerUnNumero() {

		try {
			System.out.print("Entrer un numero de 4 chiffres : ");
			do {

				if (input.hasNextInt()) {
					try {
					str = input.next();
					}catch (Exception e) {
						System.out.println("Erreur saisi nbChoix !!!");
						System.out.println("Saisir uniquement des chiffres nbChoix SVP...");
					}
					if (str.length() == 4) {
						isNumber = true;
					}
				} else {
					System.out.println("Erreur de saisi!!!! ");
					System.out.print("Entrer un numero de 4 chiffres : ");
					isNumber = false;
					input.next();
				}
//				
			} while (!(isNumber));

			for (int i = 0; i < str.length(); i++) {

				proposition[i] = Integer.parseInt(String.valueOf(str.charAt(i)));

				if (proposition.length < 4) {
					System.out.println("saisire un numèro de 4 chiffres SVP!!!!!! ");
				}
			}

		} catch (Exception e) {
			e.printStackTrace();

		}

		return proposition;
	}

	public int[] getProposition() {
		return proposition;
	}

	public void setProposition(int[] proposition) {
		this.proposition = proposition;
	}

//	public static void main(String str[]) {
//		Joueur j = new Joueur();
//		j.ProposerUnNumero();
//	}

}
