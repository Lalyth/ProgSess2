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
		case 15:
			Question15(scan);
			break;
		case 16:
			Question16(scan);
			break;
		case 17:
			Question17(scan);
			break;
		case 18:
			Question18(scan);
			break;
		default:
			System.out.println("Un bon choix svp!");
			break;
		}
		scan.close();
	}	
           	
// Facile	
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

// Moyen	
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
		int somme = 0;
		
		for (int i = 0; i < 99; i++) {
			if (i % 3 == 0) {
				somme = somme + i;
			}
		}
		System.out.print("La somme des entiers multiple de 3 et plus petit que 100 est de " + somme);
	}
	
	// Question 15 Suite de Fibonacci
	public static void Question15(Scanner scan) {
		int iteration = 0;
		int fibo = 0;
		int fiboA = 0;
		int fiboB = 1;
		
		System.out.print("Combien d'itérations ? ");
		iteration = scan.nextInt();
		
		if (iteration == 1) {
			System.out.print(fiboA);
		} else if (iteration == 2) {
			System.out.print(fiboA + " " + fiboB);
		} else { 
			System.out.print(fiboA + " " + fiboB + " ");
		for (int i = 1; i <= iteration - 2; i++) {
			fibo = fiboA + fiboB;
			System.out.print(fibo + " ");
			fiboA = fiboB;
			fiboB = fibo;
		}
		}
	}
	
// Difficile
	// Question 16 Gestion d'un compte bancaire
	public static void Question16(Scanner scan) {
		
		double solde = 0;
		String choix;
		String printSolde = String.format("+---------------------------+\n| Votre solde est de %.2f $ |\n+---------------------------+", solde);
		
		do {	
			System.out.print("\nQuel option ?\n\n" + 
							"D pour dépôt.\n" + 
							"R pour retrait.\n" + 
							"F paiement de facture.\n" + 
							"S visualiser le solde au compte.\n" + 
							"T terminer les transactions.\n");
			choix = scan.next().toUpperCase();
			
			if (choix.contentEquals("D")) {
				System.out.print("Combien voulez vous déposer : ");
				double depot = scan.nextDouble();
				
				if (depot < 0) {
					System.out.format("Entrer un montant positif.");
				} else {
					solde = solde + depot;
					System.out.print(printSolde);
				}
			} else if (choix.contentEquals("R")) {
				System.out.print("Combien voulez vous retirer : ");
				double retrait = scan.nextDouble();
				
				if (retrait < 0) {
					System.out.format("Entrer un montant positif.");
				} else if (solde < retrait) {
					System.out.format("Vous n'avez pas assez d'argent.");
				} else {
					solde = solde - retrait;
					System.out.print(printSolde);
				}
			} else if (choix.contentEquals("F")) {
				System.out.print("Entrer le montant du paiement : ");
				double paiment = scan.nextDouble();
				
				if (paiment < 0) {
					System.out.format("Entrer un montant positif.");
				} else if (solde < paiment) {
					System.out.format("Vous n'avez pas assez d'argent.");
				} else {
					solde = solde - paiment;
					System.out.print(printSolde);
				}
			} else if (choix.contentEquals("S")) {
				System.out.print(printSolde);
			} else if (choix.contentEquals("T")) {
				System.out.format("Merci, au revoir!");
			} else {
				System.out.format("Entrer une option valide.");
			}
		} while (!choix.contentEquals("T"));
	}
	
	// Question 17 Guichet d'aviation
	public static void Question17(Scanner scan) {
		// Logs
		int nbrClient = 0;
		int ageA = 0;  // 0 a 5
		int ageB = 0;  // 6 a 17
		int ageC = 0;  // 18 a 64
		int ageD = 0;  // 65 +
		int sommePrix = 0;
		double sommeEscG = 0;
		int sommeEscM = 0;
		double sommeTps = 0;
		double sommeTvq = 0;
		double sommeTotal = 0;
		
		// Use "try catch" pour gerer les erreur d'input
		
		String autre;
		do {
			String nom;
			int age = 0;
			int prix = 0; 
			String destination;
			int groupe = 0;
			double escompteG = 1;
			String membre = "n";
			int escompteM = 0;
			int memType = 0;
			double tps = 0;
			double tvq = 0;
			double sousTotal = 0;
			double total = 0;
			double escompteGT = 0;
			
			// Nom		
			System.out.print("Quel est votre nom ? ");
			nom = scan.next();
		
			// Age -> Prix 	
			do {
				try {
					System.out.print("Quel est votre âge ? ");
					scan.nextLine();
					age = scan.nextInt();
					} catch (Exception e) {
						age = -1;
					}
					if (age >= 0 && age <= 5) {
						prix = 200;
						ageA++;
					} else if (age >= 6 && age <= 17) {
						prix = 250;
						ageB++;
					} else if (age >= 18 && age <= 64) {
						prix = 350;
						ageC++;
					} else if (age >= 65) {
						prix = 275;
						ageD++;
					} else if (age < 0) {
						System.err.println("Écrire un âge valide.");
						age = -1;
					}
				} while (age == -1);
			
			// Destination		
			System.out.print("Votre destination ? ");
			destination = scan.next();
		
			// Groupe		
			do {
				try {
					System.out.print("Combien de personne dans le groupe ? ");
					scan.nextLine();
					groupe = scan.nextInt();
				} catch(Exception e) {
					groupe = -1;
				}
				if (groupe >= 4 && groupe <= 9) {
					escompteG = 0.10;
				} else if (groupe >= 10) {
					escompteG = 0.20;
				} else if (groupe < 0) {
					System.err.println("Écrire un nombre positif.");
					groupe = -1;
				}
			} while (groupe == -1);
			
			// Club Magic si 65 ans et plus
			if (age >= 65) {
				do {
					System.out.print("Possedez-vous une carte Club Magic ? (O pour oui, N pour non) ");
					membre = scan.next().toLowerCase();
					if (membre.contentEquals("o")) {
						do {
							System.out.print("Or ou Argent ? (0 pour OR, 1 pour ARGENT) ");
							memType = scan.nextInt();
							if (memType == 0) { // OR
								escompteM = 25;
							} else if (memType == 1) { // ARGENT
								escompteM = 20;
							} else {
								System.err.println("Écrire 0 ou 1.");
							}
						} while (memType != 0 && memType != 1);
					} else if (membre.contentEquals("n")) {
						// Ne rien faire
					} else {
						System.err.println("Écrire O ou N");
					}
				} while (!membre.contentEquals("o") && !membre.contentEquals("n"));
			}
			
			// Calcul escompte
			if (escompteG == 1) {
				sousTotal = prix - escompteM;
			} else {
				escompteGT = prix * escompteG;
				sousTotal = prix - escompteGT - escompteM;
			}
			
			// Calcul des taxes
			tps = sousTotal * 0.05;
			tvq = sousTotal * 0.095;
			total = sousTotal + tps + tvq;
			
			
			// Impression des info (O = Membre / G = Groupe)
			String impressionO = String.format("- - - - -\n"
					+ "Votre nom : %s\n"
					+ "Votre destination : %s\n"
					+ "Le prix de base : %d\n"
					+ "Votre escompte Club Magic : %d $\n"
					+ "TPS : %.2f $\n"
					+ "TVQ : %.2f $\n"
					+ "Total : %.2f $",nom,destination,prix,escompteM,tps,tvq,total);
			String impressionOG = String.format("- - - - -\n"
					+ "Votre nom : %s\n"
					+ "Votre destination : %s\n"
					+ "Le prix de base : %d\n"
					+ "Votre escompte de groupe : %.2f %% => %.2f $\n"
					+ "Votre escompte Club Magic : %d $\n"
					+ "TPS : %.2f $\n"
					+ "TVQ : %.2f $\n"
					+ "Total : %.2f $",nom,destination,prix,escompteG,escompteGT,escompteM,tps,tvq,total);
			String impression = String.format("- - - - -\n"
					+ "Votre nom : %s\n"
					+ "Votre destination : %s\n"
					+ "Le prix de base : %d\n"
					+ "TPS : %.2f $\n"
					+ "TVQ : %.2f $\n"
					+ "Total : %.2f $",nom,destination,prix,tps,tvq,total);
			String impressionG = String.format("- - - - -\n"
					+ "Votre nom : %s\n"
					+ "Votre destination : %s\n"
					+ "Le prix de base : $%d\n"
					+ "Votre escompte de groupe : %.2f %% => %.2f $\n"
					+ "TPS : %.2f $\n"
					+ "TVQ : %.2f $\n"
					+ "Total : %.2f $",nom,destination,prix,escompteG,escompteGT,tps,tvq,total);
			
			if (membre.contentEquals("o")) {
				if (escompteG == 1) {
					System.out.println(impressionO);
				} else {
					System.out.println(impressionOG);
				} 
			} else {
				if (escompteG == 1) {
					System.out.println(impression);
				} else {
					System.out.println(impressionG);
				}
			}
			
			// Logs
			nbrClient++;
			sommeTps = sommeTps + tps;
			sommeTvq = sommeTvq + tvq;
			sommePrix = sommePrix + prix;
			sommeEscM = sommeEscM + escompteM;
			sommeEscG = sommeEscG + escompteGT;
			sommeTotal = sommeTotal + total;
			
			// Loop prompt
			do {
				System.out.print("Un autre client O/N ? ");
				autre = scan.next().toLowerCase();
				if (!autre.contentEquals("o") && !autre.contentEquals("n")) {
					System.out.println("--- Erreur ---");
				}
			} while (!autre.contentEquals("o") && !autre.contentEquals("n"));
		} while (autre.contentEquals("o")); // loop
	
		// Impression des logs
		String impressionLogs = String.format("-  -  -  -  -\n"
				+ "Clients : %d\n"
				+ "0 à 5 ans : %d\n"
				+ "6 à 17 ans : %d\n"
				+ "18 à 64 ans : %d\n"
				+ "65 ans et + : %d\n"
				+ "Somme ventes billet : %d $\n"
				+ "Somme escompte groupe : %.2f $\n"
				+ "Somme escompte Magic : %d.00 $\n"
				+ "Somme TPS : %.2f $\n"
				+ "Somme TVQ : %.2f $\n"
				+ "Somme d'argent accumulé : %.2f $",nbrClient,ageA,ageB,ageC,ageD,sommePrix,sommeEscG,sommeEscM,sommeTps,sommeTvq,sommeTotal);
		
		System.out.print(impressionLogs);
	}

	// Question 18 Marathon de Montréal
	public static void Question18(Scanner scan) {
		
		
	}
	
} // Fin