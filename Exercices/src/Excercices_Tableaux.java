import java.util.Scanner;

public class Excercices_Tableaux {
	static Scanner scan = new Scanner(System.in);

	static int[] tabA = {1,2,11,30,4,5,6,7,8,9,10}; // 11

	static int[] tabB = {6,5,4,7,3,9,10,8,99}; // 8

	static int[][] tabC = {{10,20,30},{40,50,60},{71,81,91}}; // 3 // 3 // 3 // (9)


	public static void main(String[] args) {

		while (true) {
			menu();
		}

	}


	private static void menu() {
		boolean invalide = false;
		do {
			try {
				System.out.print("\nQuel question ? ");
				int choix = scan.nextInt();
				invalide = false;
				switch (choix) {
					case 1 :
						Q1();
						break;
					case 2 :
						Q2();
						break;
					case 3 :
						Q3();
						break;
					case 4 :
						Q4();
						break;
					case 5 :
						Q5();
						break;
					case 6 :
						Q6();
						break;
					case 7 :
						Q7();
						break;
					case 8 :
						Q8();
						break;
					case 9 :
						Q9();
						break;
					case 10 :
						Q10();
						break;
					case 11 :
						Q11();
						break;
					case 12 :
						Q12();
						break;
					case 13 :
						Q13();
						break;
					case 14 :
						Q14();
						break;
					case 15 :
						Q15();
						break;
					default :
						System.out.println("Erreur");
						scan.nextLine();
						invalide = true;	
				}
			} catch (Exception e) {
				System.out.println("Erreur");
				scan.nextLine();
				e.printStackTrace();
				invalide = true;
			}
		} while (invalide == true);

	}

	private static void Q1() {
		int total = 0;
		for (int nombre : tabA) {
			total = total + nombre;
		}
		System.out.println(total);
	}

	private static void Q2() {
		int total = 0;
		int sommeA = 0;
		int sommeB = 0;

		for (int nombre : tabA) {
			sommeA = sommeA + nombre;
		}

		for (int nombre : tabB) {
			sommeB = sommeB + nombre;
		}

		total = sommeA + sommeB;
		System.out.println(total);
	}

	private static void Q3() {
		double moyenneA = 0;
		double moyenneB = 0;		
		double moyenneC = 0;

		for (int nombre : tabA) {
			moyenneA = moyenneA + nombre;
		}

		moyenneC = moyenneC + moyenneA;
		moyenneA = moyenneA / tabA.length;

		System.out.println(moyenneA);

		for (int nombre : tabB) {
			moyenneB = moyenneB + nombre;
		}

		moyenneC = moyenneC + moyenneB;
		moyenneB = moyenneB / tabB.length;

		System.out.println(moyenneB);

		moyenneC = moyenneC / (tabA.length + tabB.length);
		System.out.println(moyenneC);
	}

	private static void Q4() {
		int min = 100;
		int max = 0;

		for (int nombre : tabA) {
			if (nombre > max) {
				max = nombre;
			}
			if (nombre < min) {
				min = nombre;
			}
		}
		System.out.format("Min : %d\n"
				+ "Max : %d\n",min,max);
	}

	private static void Q5() {
		System.out.print("Quel nombre voulez-vous chercher ? ");
		int recherche = scan.nextInt();
		boolean trouverA = false;
		boolean trouverB = false;
		boolean trouverC = false;

		for (int nombre : tabA) {
			if (nombre == recherche) {
				trouverA = true;
			}
		}

		for (int nombre : tabB) {
			if (nombre == recherche) {
				trouverB = true;
			}
		}

		for (int i = 0; i < 3; i++) { // Lignes
			for (int j = 0; j < 3; j++) { // Colonnes
				int nombre = tabC[i][j];
				if (nombre == recherche) {
					trouverC = true;
				}
			}
		}

		System.out.format("Résultat\n"
				+ "\n"
				+ "Tableau A : %b\n"
				+ "Tableau B : %b\n"
				+ "Tableau C : %b\n",trouverA,trouverB,trouverC);

	}

	private static void Q6() {
		int sommeLigne0 = 0;
		int sommeLigne1 = 0;
		int sommeLigne2 = 0;

		int sommeColon0 = 0;
		int sommeColon1 = 0;
		int sommeColon2 = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == 0) {
					sommeLigne0 = sommeLigne0 + tabC[i][j];
				} else if (i == 1) {
					sommeLigne1 = sommeLigne1 + tabC[i][j];
				} else {
					sommeLigne2 = sommeLigne2 + tabC[i][j];
				}
				if (j == 0) {
					sommeColon0 = sommeColon0 + tabC[i][j];
				} else if (j == 1) {
					sommeColon1 = sommeColon1 + tabC[i][j];
				} else {
					sommeColon2 = sommeColon2 + tabC[i][j];
				}
			}
		}

		System.out.format("Somme Ligne 0 : %d\n"
				+ "Somme Ligne 1 : %d\n"
				+ "Somme Ligne 2 : %d\n"
				+ "Somme Colonne 0 : %d\n"
				+ "Somme Colonne 1 : %d\n"
				+ "Somme Colonne 2 : %d\n",sommeLigne0,sommeLigne1,sommeLigne2,sommeColon0,sommeColon1,sommeColon2);
	}

	private static void Q7() {

		for (int n : tabB) {
			System.out.print(n + " ");
		}
		System.out.println();

		int buffer = 0;
		for (int i = 0; i < tabB.length / 2 ; i++) {
			buffer = tabB[i];
			tabB[i] = tabB[(tabB.length - 1) - i];
			tabB[(tabB.length - 1) - i] = buffer;
		}

		for (int n : tabB) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

	private static void Q8() {

		for (int n : tabB) {
			System.out.print(n + " ");		
		} System.out.println();


		for (int i = 0; i < tabB.length; i++) {
			int buffer = tabB[i];
			for (int j = 0; j < tabB.length; j++) {
				if (buffer < tabB[j]) {
					buffer = tabB[j];
					tabB[j] = tabB[i];
					tabB[i] = buffer;
				}
			}
		}

		for (int n : tabB) {
			System.out.print(n + " ");
		} System.out.println();

	}

	private static void Q9() {

		for (int n : tabA) {
			for (int o : tabB) {
				if (n == o) {
					System.out.print(n + " ");
				}
			}
		}
		System.out.println("sont commun");
	}

	private static void Q10() { //alex

		boolean diff = true;

		for (int a : tabA) {
			for (int b : tabB) {
				if (a == b) {
					diff = false;
				}
			}
			if (diff == true) {
				System.out.print(a + " ");
			}
		}
		
		for (int b : tabB) {
			diff = true;
			for (int a : tabA) {
				if (b == a) {
					diff = false;
				}
			}
			if (diff == true) {
				System.out.print(b + " ");
			}

		}	

		System.out.println("sont différent");

	}

	private static void Q11() {
		int[] top3 = {0,0,0};

		for (int i = 0; i < tabA.length; i++) {
			int buffer = tabA[i];
			for (int j = 0; j < tabA.length; j++) {
				if (buffer > tabA[j]) {
					buffer = tabA[j];
					tabA[j] = tabA[i];
					tabA[i] = buffer;
				}
			}
		}

		top3[0] = tabA[0];
		top3[1] = tabA[1];
		top3[2] = tabA[2];

		for (int n : top3) {
			System.out.format("%d ",n);
		} System.out.println();

	}

	private static void Q12() {
		int[] valeur = {0,0,0,0,0,0,0,0,0,0};

		for (int i = 0; i < valeur.length; i++) {
			System.out.println("Valeur # " + (i + 1));
			valeur[i] = scan.nextInt();
		}

		System.out.print("Vos nombre en file/fifo ");
		for (int i = 0; i < valeur.length; i++) {
			System.out.print(valeur[i] + " ");
		}
		System.out.println();

	}

	private static void Q13() {
		int[] valeur = {0,0,0,0,0,0,0,0,0,0};

		for (int i = 0; i < valeur.length; i++) {
			System.out.println("Valeur # " + (i + 1));
			valeur[i] = scan.nextInt();
		}

		System.out.print("Vos nombre en pile/lifo ");
		for (int i = 9; i >= 0; i--) {
			System.out.print(valeur[i] + " ");
		}
		System.out.println();

	}

	private static void Q14() {

	}

	private static void Q15() {

	}

}
