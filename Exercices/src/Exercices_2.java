/* Exercices 2
 * Auteur : Philippe Lamarche
 * Date : 14 Avril 2020 */

import java.util.Scanner;
public class Exercices_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //voir Q4 pour methode
		// Question1();
		// Question2();
		// Question3();
		// Question4(scan);
		// Question5();
		// Question6();
		// Question7math();
		// Question7if();
		// Question8();
		// Question9();
		// Question10();
		// Question11();
		// Question11();
		// Question12();
		// Question13();
		// Question14();
		// Question15();
		// Question16();
		// Question17();
		// Question18();
		// Question19();
		scan.close();
	}

// Facile
	//Question 1 Prime d'assurance
	public static void Question1() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Montant de vente de la maison : ");
		int montantVentes = scan.nextInt();		
		int prime = montantVentes / 100 * 10;
		
		if (montantVentes <= 0) {
			System.out.println("S.V.P. entrer un montant positif.");
		} else {
			System.out.println();
			System.out.println("Pour un montant de ventes de " + montantVentes);
			System.out.println("-   La prime sera de " +  prime + "$");
		}
		scan.close();
	}

	//Question 2 La moyenne
	public static void Question2() {
		Scanner scan = new Scanner(System.in);

		System.out.print("Entrer le premier nombre : ");
		int nombreA = scan.nextInt();
		scan.nextLine();
		System.out.print("Entrer le deuxième nombre : ");
		int nombreB = scan.nextInt();
		scan.nextLine();
		System.out.print("Entrer le troisième nombre : ");
		int nombreC = scan.nextInt();
		
		int moyenne = (nombreA + nombreB + nombreC)/3;
		System.out.println("\nLa moyenne des trois nombres est " + moyenne + ".");
		
		scan.close();
	}	

	//Question 3 Le portier
	public static void Question3() {
		Scanner scan = new Scanner(System.in);

		System.out.print("Quel est votre âge ? ");
		int age = scan.nextInt();
		
		if (age < 0) {
			System.out.println("Entrer un âge valide.");
		} else if (age >= 18) {
			System.out.println("-    C'est bon, il peut passer.");
		} else { 
			System.out.println("-    Interdiction de passer!");
		}
		scan.close();
	}

	//Question 4 Lady's night
	public static void Question4(Scanner scan) {
		System.out.print("Quel est votre âge ? " );
		int age = scan.nextInt();
		scan.nextLine();
		
		if (age >= 18) {
			System.out.print("Quel est votre sexe ? ");
			char sexe = scan.next().charAt(0);
			char sexeUpper = Character.toUpperCase(sexe);
			if (sexeUpper == 77 || sexeUpper == 70) {
				if (sexeUpper == 'F') {
					System.out.println("-    Le coût du billet est de 0$. Votre billet est donc gratuit!");
				} else {
					System.out.println("-    Le coût du billet est de 10$.");
				}
			} else {
				System.out.println("Entrer un sexe valide.");
			}
		} else if (age < 18 && age > 0) {
			System.out.println("-    Interdiction de passer!");
		} else {
			System.out.println("Entrer un âge valide.");
		}
	}
	
	//Question 5 Le calendrier
	public static void Question5() {
		Scanner scan = new Scanner(System.in);
		//int mois = 8;
		
		int mois = scan.nextInt();
		
		
		if (mois == 1) {
			System.out.println("Janvier");
		} else if (mois == 2) {
			System.out.println("Février");			
		} else if (mois == 3) {
			System.out.println("Mars");
		} else if (mois == 4) {
			System.out.println("Avril");
		} else if (mois == 5) {
			System.out.println("Mai");
		} else if (mois == 6) {
			System.out.println("Juin");
		} else if (mois == 7) {
			System.out.println("Juillet");
		} else if (mois == 8) {
			System.out.println("Août");
		} else if (mois == 9) {
			System.out.println("Septembre");
		} else if (mois == 10) {
			System.out.println("Octobre");
		} else if (mois == 11) {
			System.out.println("Novembre");
		} else if (mois == 12) {
			System.out.println("Décembre");
		}
		scan.close();
	}
	
	// Question 6 Calendrier billingue
	public static void Question6() {
		int mois = 8;
		char langue = 'A';
		
		if (langue == 'F') {
			if (mois == 1) {
			System.out.println("Janvier");
			} else if (mois == 2) {
				System.out.println("Février");			
			} else if (mois == 3) {
				System.out.println("Mars");
			} else if (mois == 4) {
				System.out.println("Avril");
			} else if (mois == 5) {
				System.out.println("Mai");
			} else if (mois == 6) {
				System.out.println("Juin");
			} else if (mois == 7) {
				System.out.println("Juillet");
			} else if (mois == 8) {
				System.out.println("Août");
			} else if (mois == 9) {
				System.out.println("Septembre");
			} else if (mois == 10) {
				System.out.println("Octobre");
			} else if (mois == 11) {
				System.out.println("Novembre");
			} else if (mois == 12) {
				System.out.println("Décembre");
			}
		}
		else {
			if (mois == 1) {
			System.out.println("January");
			} else if (mois == 2) {
				System.out.println("February");			
			} else if (mois == 3) {
				System.out.println("March");
			} else if (mois == 4) {
				System.out.println("April");
			} else if (mois == 5) {
				System.out.println("May");
			} else if (mois == 6) {
				System.out.println("June");
			} else if (mois == 7) {
				System.out.println("July");
			} else if (mois == 8) {
				System.out.println("August");
			} else if (mois == 9) {
				System.out.println("September");
			} else if (mois == 10) {
				System.out.println("October");
			} else if (mois == 11) {
				System.out.println("November");
			} else if (mois == 12) {
				System.out.println("December");
			}
		}
	}
	
	// Question 7 (math) Maximum.math
	public static void Question7math() {
		int nombreA = 4;
		int nombreB = 10;
		int nombreC = 5;
		// Trouver le nombre Max
		int nombreMaxAB = Math.max(nombreA, nombreB);
		int nombreMax = Math.max(nombreMaxAB, nombreC);
		//Trouver le nombre Min
		int nombreMinAB = Math.min(nombreA, nombreB);
		int nombreMin = Math.min(nombreMinAB, nombreC);
		System.out.println("Le plus grand nombre est " + nombreMax + " et le plus petit est " + nombreMin + ".");	
	}
	
	// Question 7 (if) Maximum.if
	public static void Question7if() {
		int nombreA = 4;
		int nombreB = 10;
		int nombreC = 5;
		// Trouver le nombre Max
		if (nombreA > nombreB && nombreA > nombreC) {
			System.out.print("Le plus grand nombre est " + nombreA);
		} else if (nombreB > nombreA && nombreB > nombreC) {
			System.out.print("Le plus grand nombre est " + nombreB);
		} else {
			System.out.print("Le plus grand nombre est " + nombreC);
		}
		// Trouver le nombre Min
		if (nombreA < nombreB && nombreA < nombreC) {
			System.out.println(" et le plus petit nombre est " + nombreA + ".");
		} else if (nombreB < nombreA && nombreB < nombreC) {
			System.out.println(" et le plus petit nombre est " + nombreB + ".");
		} else {
			System.out.println(" et le plus petit nombre est " + nombreC + ".");
		}
	}
	
	// Question 8 Somme et moyenne
	public static void Question8() {
		int nombreA = 5;
		int nombreB = 10;
		int nombreC = 15;
		int somme = nombreA + nombreB + nombreC;
		int moyenne = (nombreA + nombreB + nombreC) / 3;
		System.out.println("La somme est de " + somme + ". La moyenne est " + moyenne);
	}
	
// Moyennement difficile
	// Question 9
	public static void Question9() {
		int ageParticipant = 20;
		int ageRabais = 1;
		int age15a35 = 2;
		int age35a55 = 3;
		
		if (ageParticipant < 15 || ageParticipant > 55) {
			System.out.println(ageRabais + " $");
		} else if (ageParticipant >= 35) {
			System.out.println(age35a55 + " $");
		} else {
			System.out.println(age15a35 + " $");
		}
	}
	
	// Question 10 Calcul de cote
	public static void Question10() {
		int note = 90;
		
		if (note >= 95) {
			System.out.println("A+");
		} else if (note < 95 && note >= 90) {
			System.out.println("A");
		} else if (note < 90 && note >= 85) {
			System.out.println("B");
		} else if (note < 85 && note >= 80) {
			System.out.println("C");
		} else if (note < 80 && note >= 75) {
			System.out.println("D+");
		} else if (note < 75 && note >= 70) {
			System.out.println("D");
		} else if (note < 70 && note >= 60) {
			System.out.println("D-");
		} else {
			System.out.println("E");
		}
	}
	
	// Question 11 Admissibilité à l’examen 1
	public static void Question11() {
		int noteExam1 = 60;
		int noteExam2 = 59;
		
		if (noteExam1 >= 60 && noteExam2 >= 60) {
			System.out.println("Bravo, vous êtes admissible à l’examen.");
		} else {
			System.out.println("Malheureusement, vous n’êtes pas admissible à l’examen.");
		}
	}
	
	// Question 12 Admissibilité à l’examen 2
	public static void Question12() {
		int noteExamA = 59;
		int noteExamB = 59;
		int noteExamC = 59;
		int noteExamD = 59;
		
		if (noteExamA >= 60) {
			System.out.println("Bravo, vous êtes admissible à l’examen.");
		} else if (noteExamB >= 60) {
			System.out.println("Bravo, vous êtes admissible à l’examen.");
		} else if (noteExamC >= 60) {
			System.out.println("Bravo, vous êtes admissible à l’examen.");
		} else if (noteExamD >= 60) {
			System.out.println("Bravo, vous êtes admissible à l’examen.");
		} else {
			System.out.println("Malheureusement, vous n’êtes pas admissible à l’examen.");
		}	
	}
	
	// Question 13 Information sur un nombre
	public static void Question13() {
		int monNombre = 0;
				
		if (monNombre > 0) {
			System.out.print("Le nombre est positif ");
		} else if (monNombre < 0) {
			System.out.print("Le nombre est négatif ");
		} else {
			System.out.print("Le nombre est zéro ");
		}
		if (monNombre % 2 == 0) {
			System.out.println("et le nombre est pair.");
		} else {
			System.out.println("et le nombre est impair.");
		}
	}
	
	// Question 14 Voyelle ou consonne
	public static void Question14() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entrer une lettre svp (la premiere lettre du mot sera tenu en compte) :");
		char lettre = scan.next().charAt(0);
		
		if (lettre == 'a' || lettre == 'e' || lettre == 'i' || lettre == 'o' || lettre == 'u' || lettre == 'y') {
			System.out.println("Ceci est une voyelle.");
		} else if (lettre == 'A' || lettre == 'E' || lettre == 'I' || lettre == 'O' || lettre == 'U' || lettre == 'Y') {
			System.out.println("Ceci est une voyelle.");
		} else if (lettre > 64 && lettre < 91 || lettre > 96 && lettre < 123) {
			System.out.println("Ceci est une consonne.");
		} else if (lettre > 47 && lettre < 58) {
			System.out.println("Ceci n\'est pas une lettre, il s\'agit d\'un chiffre...");
		} else {
			System.out.println("Ceci n\'est pas une lettre, il s\'agit d\'un symbole...");
		}
		scan.close();
	}
	
	// Question 15 Statistiques automobile ( , et . DecimalFormat et .useLocale(locale) )
	public static void Question15() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Litre réservoir (Utiliser une virgule si applicable) : ");
		double litreReservoir = scan.nextDouble();
		scan.nextLine();
		System.out.print("Conso par 100km (Utiliser une virgule si applicable) : ");
		double consommation = scan.nextDouble();
		scan.nextLine();		
		System.out.print("Prix essence    (Utiliser une virgule si applicable) : ");
		double prixEssence = scan.nextDouble();
		// Calculs
		double distanceParcourable = litreReservoir / consommation * 100;
		double cout250 = consommation / 100 * 250 * prixEssence;
		// Résultat
		String total = "\n-    Distance pouvant être parcourue : " + distanceParcourable + " km"+ "\n-    Coût pour voyager 250 km : " + cout250 + " $";
		System.out.println(total);
		
		scan.close();
	}
	
	// Question 16 Calcul du nombre de pots de peinture à acheter
	public static void Question16() {
		Scanner scan = new Scanner(System.in);
		double peinture = 400; // fixe, pieds carré par pots
		System.out.print("Quel est la grandeur de la pièce en pieds carré : ");
		double grandeur = scan.nextDouble();
		double nbrPots = grandeur / peinture;
		int nbrPotsInt = (int) Math.ceil(nbrPots);
		String resultat = "\nIl vous faudra " + nbrPotsInt + " pots de peinture.";
		System.out.println(resultat);
		scan.close();
	}
	
// Difficle	
	// Question 17 Roche - Papier - Ciseaux
	public static void Question17() {
		Scanner scan = new Scanner(System.in);
		
		String introA = "Veuillez inscrire le choix du joueur 1 :\n1- Roche\n2- Papier\n3- Ciseaux\nChoix : ";
		String introB = "Veuillez inscrire le choix du joueur 2 :\n1- Roche\n2- Papier\n3- Ciseaux\nChoix : ";
		String partieNulle = "C'est une partie nulle!";
		String victoireA = "Joueur A gagne la partie !";
		String victoireB = "Joueur B gagne la partie !";
		String erreur = "Vous avez entré une valeur incorrect !";
		
		System.out.println("Bienvenue dans Roche-Papier-Ciseaux!");
		System.out.print(introA);
		int choixJoueurA = scan.nextInt();
		scan.nextLine();
		System.out.println();
		System.out.print(introB);
		int choixJoueurB = scan.nextInt();
		System.out.println();
		
		if (choixJoueurA > 0 && choixJoueurA < 4 && choixJoueurB > 0 && choixJoueurB < 4) {
			if (choixJoueurA == choixJoueurB) {
				System.out.print(partieNulle);
			} else if (choixJoueurA == 1 && choixJoueurB == 2) {
				System.out.println(victoireB);
			} else if (choixJoueurA == 1 && choixJoueurB == 3) {
				System.out.println(victoireA);
			} else if (choixJoueurA == 2 && choixJoueurB == 1) {
				System.out.println(victoireA);
			} else if (choixJoueurA == 2 && choixJoueurB == 3) {
				System.out.println(victoireB);
			} else if (choixJoueurA == 3 && choixJoueurB == 1) {
				System.out.println(victoireB);
			} else if (choixJoueurA == 3 && choixJoueurB == 2) {
				System.out.println(victoireA);
			} 
		} else {
			System.out.println(erreur);
		}
		scan.close();
	}
	
	// Question 18 Les nombres premiers
	public static void Question18() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Entrer votre nombre pour vérifier si c'est un nombre premier : ");
		long nombre = scan.nextLong();
		
		String nombrePremier = nombre + " est un nombre premier.";
		String nombreAutre = nombre + " n'est pas un nombre premier.";
		
		if (nombre == 2 || nombre == 3 || nombre == 5 || nombre == 7 || nombre % 2 > 0 && nombre % 3 > 0 && nombre % 4 > 0 && nombre % 5 > 0 && nombre % 6 > 0 && nombre % 7 > 0 &&nombre % 8 > 0 && nombre % 9 > 0) {
			System.out.println(nombrePremier);
		} else { 
			System.out.println(nombreAutre);
		}
		scan.close();
	}
	
	// Question 19 Nombre de journées dans un mois
	public static void Question19() {
		
		int mois = 4;
		double annee = 2020;
		double bisextile = annee / 4 % 1; // Si il reste 0 c'est une année bisextile

		if (mois == 2 && bisextile == 0) {
			System.out.println("29 Jours");
		} else if (mois == 2 && bisextile != 0) {
			System.out.println("28 Jours");
		} else if (mois == 1 || mois == 3 || mois == 5 || mois == 7 || mois == 8 || mois == 10 || mois == 12) {
			System.out.println("31 jours");
		} else {
			System.out.println("30 Jours");
		}
	}
	
} // Fin