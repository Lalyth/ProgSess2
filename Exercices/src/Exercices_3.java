/* Exercices 3
 * Auteur : Philippe Lamarche
 * Date : 21 Avril 2020 */

import java.util.Scanner;
public class Exercices_3 {
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quel question ? ");
		int choix = Integer.parseInt(scan.nextLine());
		switch(choix) {
		case 1:
			Question1();
			break;
		case 2:
			Question2(scan);
			break;
		case 3:
			Question3(scan);
			break;
		case 4:
			Question4();
			break;
		case 5:
			Question5(scan);
			break;
		case 6:
			Question6(scan);
			break;
		case 7:
			Question7(scan);
			break;
		case 8:
			Question8(scan);
			break;
		case 9:
			Question9(scan);
			break;
		case 10:
			Question10(scan);
			break;
		case 11:
			Question11(scan);
			break;
		case 12:
			Question12(scan);
			break;
		case 13:
			Question13();
			break;
		case 14:
			Question14();
			break;
		}
		scan.close();
	}	
	
//Facile	
	// Question 1 Nombres de 1 à 25
	public static void Question1() {
		for (int i = 1; i<= 10; i = i + 1) {
			System.out.println(i);
		}
	}
	
	// Question 2 Forme géométrique - Carré
	public static void Question2(Scanner scan) {
		int i = 0;
		int j = 0;
		
		System.out.print("Combien de lignes ? ");
		int nombreLignes = scan.nextInt();
		
		while (j < nombreLignes) {
			while (i < nombreLignes) {
				System.out.print("* ");
				i++; 
			}
			System.out.print("\n");
			i = 0;
			j++;
		
		}
	}
	
	// Question 3 Forme géométrique - Triangle rectangle
	public static void Question3(Scanner scan) {
		System.out.print("Combien de lignes ? ");
		int nombreLignes = scan.nextInt();
		
		 for (int j = 1; j <= nombreLignes; j++) {
			for (int i = 1; i <= j; i++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}
	}
	
	// Question 4 Calculus varius
	public static void Question4() {
		int nombre = 0;
		int totalA = 0;
		int totalB = 0;
		int totalC = 0;
		
		while (nombre <= 20) {
			totalA = totalA + nombre;
			nombre++;
		} System.out.println(totalA);
		while (nombre > 20 && nombre <=50) {
			if (nombre % 2 == 0) {
				totalB = totalB + nombre;
				nombre++;
			} else {
				nombre++;
			}
		} System.out.println(totalB);
		while (nombre > 50 && nombre <=100) {
			if (nombre % 2 != 0) {
				totalC = totalC + nombre;
				nombre++;
			} else {
				nombre++;
			}
		} System.out.println(totalC);
	}

	// Question 5 Nombre réversible
	public static void Question5(Scanner scan) {
		System.out.print("Inscrire un nombre : ");
		int nombre = scan.nextInt();
		int nombreInverse = 0;
		
		while (nombre != 0) {
			int chiffre = nombre % 10;
			nombreInverse = nombreInverse * 10 + chiffre;
			nombre /= 10;
		} System.out.println("Votre nombre inversé est : " + nombreInverse);
	}

	// Question 6 Calcul de sommes (crash quand on écrit une autre lettre que t ou T)
	public static void Question6(Scanner scan) {
		String nombreString = "0";
		int nombre = 0;
		int somme = 0;
			
		do { 
			System.out.print("Inscrire un nombre : ");
			nombreString = scan.next();
			if (!nombreString.contentEquals("t") && !nombreString.contentEquals("T")) {
				nombre = Integer.parseInt(nombreString);				
				somme = somme + nombre;
			} else if (nombreString.contentEquals("t") || nombreString.contentEquals("T")) {
				System.out.println("La somme est de : " + somme);
			}
		} while (!nombreString.contentEquals("t") && !nombreString.contentEquals("T"));
	}

	// Question 7 Calcul de la moyenne (crash quand on écrit une autre lettre que t ou T)
	public static void Question7(Scanner scan) {
		String nombreString = "0";
		int nombre = 0;
		int total = 0;
		double moyenne = 0;
		int i = 0;
		
		do { 
			System.out.print("Inscrire un nombre : ");
			nombreString = scan.next();
			if (!nombreString.contentEquals("t") && !nombreString.contentEquals("T")) {
				nombre = Integer.parseInt(nombreString);
				total = total + nombre;
				i++;
			} else if (nombreString.contentEquals("t") || nombreString.contentEquals("T")) {
				moyenne = total / i;
				System.out.println("La moyenne est de : " + moyenne);
			}
		} while (!nombreString.contentEquals("t") && !nombreString.contentEquals("T"));
	}
	
	// Question 8 Forme géométrique - Losange
	public static void Question8(Scanner scan) {
		System.out.print("Combien de ligne ? ");
		double ligne = scan.nextDouble();
		int espace = (int) ligne / 2; // div par 2 pour etre collé a gauche
		int haut = (int) Math.ceil(ligne / 2);
		int bas = (int) ligne / 2;
		int l = 0;
		
		// haut du losange
		for (int i = 0; i < haut; i++) {
			for (int j = 0; j <= i; j++) {
				for (int k = 0; k < espace && l == 0; k++) {
					System.out.print(" ");
				}
				System.out.print("* ");
				l++; // trigger pour ne pas retourner dans les espacement apres la premiere etoile d'une ligne
			}
			System.out.print("\n");
			espace--;
			l = 0; // trigger reset
		} espace++; // fix pour ne pas etre decaler de 1 espace
		
		// fix si c'est un nombre pair
		if (haut != bas) {
			espace = espace + 1;
		}
		
		// bas du losange
		for (int i = bas; i > 0 ; i--) {
			for (int j = 0; j < i; j++) {
				for (int k = 0; k < espace && l == 0; k++) {
					System.out.print(" ");
				}
				System.out.print("* ");
				l++;
			}
			System.out.print("\n");
			espace++;
			l = 0;
		}
	}

	// Question 9 Valeur factorielle
	public static void Question9(Scanner scan) {
		System.out.print("Entrer le nombre : ");
		int nombre = scan.nextInt();
		int total = 1;
		
		for (int i = 0; i <= nombre - 1; i++) {
			total = total * (i + 1);
		}
		System.out.print("Factorielle de " + nombre + " est : " + total);
	}
	
	// Question 10 Carré vide
	public static void Question10(Scanner scan) {
		System.out.print("Combien de lignes ? ");
		int ligne =  scan.nextInt();
		
		for (int i = 1; i <= ligne; i++) {
			for (int j = 1; j <= ligne; j++) {	
				if (i == 1 || i == ligne) {
					System.out.print("* ");
				} else if (j == 1 || j == ligne) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}	
			}
			System.out.print("\n");
		}
		
	}

	// Question 11 Losange Variable
	public static void Question11(Scanner scan) {
		System.out.print("Plein ou vide ? ");
		String remplissage = scan.next();
		remplissage = remplissage.toLowerCase();
		
		
		if (remplissage.contentEquals("plein")) {
			System.out.print("Combien de ligne ? ");
			double ligne = scan.nextDouble();
			int espace = (int) ligne / 2; // div par 2 pour etre collé a gauche
			int haut = (int) Math.ceil(ligne / 2);
			int bas = (int) ligne / 2;
			int l = 0;
			
			// haut du losange
			for (int i = 0; i < haut; i++) {
				for (int j = 0; j <= i; j++) {
					for (int k = 0; k < espace && l == 0; k++) {
						System.out.print(" ");
					}
					System.out.print("* ");
					l++; // trigger pour ne pas retourner dans les espacement apres la premiere etoile d'une ligne
				}
				System.out.print("\n");
				espace--;
				l = 0; // trigger reset
			} espace++; // fix pour ne pas etre decaler de 1 espace
			// fix si c'est un nombre pair
			if (haut != bas) {
				espace = espace + 1;
			}
			// bas du losange
			for (int i = bas; i > 0 ; i--) {
				for (int j = 0; j < i; j++) {
					for (int k = 0; k < espace && l == 0; k++) {
						System.out.print(" ");
					}
					System.out.print("* ");
					l++;
				}
				System.out.print("\n");
				espace++;
				l = 0;
			}
		} else if (remplissage.contentEquals("vide")) {
			System.out.print("Combien de ligne ? ");
			double ligne = scan.nextDouble();
			int espace = (int) ligne / 2; // div par 2 pour etre collé a gauche
			int haut = (int) Math.ceil(ligne / 2);
			int bas = (int) ligne / 2;
			int l = 0;
			
			// haut du losange
			for (int i = 0; i < haut; i++) {
				for (int j = 0; j <= i; j++) {
					for (int k = 0; k < espace && l == 0; k++) {
						System.out.print(" ");
					}
					if (i <= 1 || j == 0 || j == i) {
						System.out.print("* ");
						l++; // trigger pour ne pas retourner dans les espacement apres la premiere etoile d'une ligne
					} else {
						System.out.print("  ");
					}
				}
				System.out.print("\n");
				espace--;
				l = 0; // trigger reset
			} espace++; // fix pour ne pas etre decaler de 1 espace
			// fix si c'est un nombre pair
			if (haut != bas) {
				espace = espace + 1;
			}
			// bas du losange
			for (int i = bas; i > 0 ; i--) {
				for (int j = 0; j < i; j++) {
					for (int k = 0; k < espace && l == 0; k++) {
						System.out.print(" ");
					}
					if (i <= 1 || j == 0 || j == i - 1) {
						System.out.print("* ");
						l++; // trigger pour ne pas retourner dans les espacement apres la premiere etoile d'une ligne
					} else {
						System.out.print("  ");
					}
				}
				System.out.print("\n");
				espace++;
				l = 0;
			}
		} else {
			System.out.print("Ecrire plein ou vide.");
		}
	}
	
	// Question 12 Table de multiplications
	public static void Question12(Scanner scan) {
		System.out.print("Nombre de lignes ? ");
		int ligne = scan.nextInt();
		System.out.print("Nombre de colonnes ? ");
		int colonne = scan.nextInt();
		
		for (int i = 1; i <= ligne; i++) {
			for (int j = 1; j <= colonne; j++) {
				if (i == 1) {
				System.out.print(j + "  ");
				} else if (j == 1) {
				System.out.print(i + "  ");
				} else {
				System.out.print(i * j + "  ");
				}
			}
			System.out.print("\n");
		}	
	}

//Moyen	
	// Question 13 Résultats scolaires
	public static void Question13() {
		String[] etudiant = {"Etu Un", "Etu Deux", "Etu Trois", "Etu Quatre", "Etu Cinq"};
		int[] note = {50, 75, 60, 90, 83};
		int max = 0;
		int maxEtu = 0;
		double moyenne = 0;
		
		// Énumerer les étudiants + note
		for (int i = 0; i < etudiant.length; i++) { 
		System.out.println(etudiant[i] + " a reçu la note de " + note[i]);
		}
		// Trouver la plus haute note
		for (int i = 1; i < note.length; i++) {
			if (note[i] > max) {
				max = note[i];
				maxEtu = i;
			}
		}
		// Trouver la moyenne
		for (int i = 0; i < note.length; i++) {
			moyenne = moyenne + note[i];
		} moyenne = moyenne / note.length;
		
		System.out.println("\nLa plus haute note est de " + note[maxEtu] + " reçu par " + etudiant[maxEtu]);
		System.out.println("La moyenne de la classe est de " + moyenne);
	}
	
	// Question 14 Somme des entiers multiple de 3 et plus petit que 100
	public static void Question14() {
		
		
	}
	
}