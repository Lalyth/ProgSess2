/* Exercise semaine 1
Auteur : Philippe Lamarche
Date : 8 Avril 2020 */


// 1
/* 
public class Exercices_1 {
	public static void main(String[] args) {
		System.out.println("Bonjour la terre");
	}
}
*/

// 2
/*
public class Exercices_1 {
	public static void main(String[] args) {
		System.out.println(21+34);
	}
}
*/

//3
/*
public class Exercices_1 {
	public static void main(String[] args) {
		System.out.println(63.0/4.0);
	}
}
*/

//4
/*
public class Exercices_1 {
	public static void main(String[] args) {
		System.out.println("   j   a   v     v  a   ");
		System.out.println("   j  a a   v   v  a a  ");
		System.out.println("j  j aaaaa   v v  aaaaa ");
		System.out.println(" jj a     a   v  a     a");
	}
}
*/

//5
/*
public class Exercices_1 {
	public static void main (String[] args) {
		System.out.println((10.4*2.5-3)/(2+(2*2)));
	}
}
*/

//6
/*
public class Exercices_1 {
	public static void main (String[] args) {
		float pi = 3.14159f;
		float rayon = 7.5f;
		
		System.out.println("");
		System.out.println("Aire");
		System.out.println(rayon * rayon * pi);
		System.out.println("");
		System.out.println("Périmètre");
		System.out.println(2 * pi * rayon);
	}
}		
*/

//6.2
/*
import java.util.Scanner;
public class Exercices_1 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Rayon du cercle : ");
		
		double rayon = scan.nextDouble();	
		float pi = 3.14159f;
		
		System.out.println("");
		System.out.println("Aire");
		System.out.println(rayon * rayon * pi);
		System.out.println("");
		System.out.println("Circonférence");
		System.out.println(2 * pi * rayon);
	}
}
*/

//7
/* 
public class Exercices_1 {
	public static void main (String[] args) {
		int numeroA = -5 + 8 * 6;
		int numeroB = (55+9) % 9;
		int numeroC = 20 + -3*5 / 8;
		int numeroD = 5 + 15 / 3 * 2 - 8 % 3;
				
		System.out.println("");
		System.out.println("Résultats:");
		System.out.print("a. ");
		System.out.println(numeroA);
		System.out.print("b. ");
		System.out.println(numeroB);
		System.out.print("c. ");
		System.out.println(numeroC);
		System.out.print("d. ");
		System.out.println(numeroD);
	}
}
*/

//8
/*
public class Exercices_1 {
	public static void main (String[] args) {
		
		String flag = 	"-------------------------------------------------------------------\n"
						+ "XWXWXWXWXWXWXWXW                                   WXWXWXWXWXWXWXWX\n"
						+ "WXWXWXWXWXWXWXWX                 A                 XWXWXWXWXWXWXWXW\n"
						+ "XWXWXWXWXWXWXWXW                AWA                WXWXWXWXWXWXWXWX\n"
						+ "WXWXWXWXWXWXWXWX           AA  AWXWA  AA           XWXWXWXWXWXWXWXW\n"
						+ "XWXWXWXWXWXWXWXW            VWXWXWXWXWV            WXWXWXWXWXWXWXWX\n"
						+ "WXWXWXWXWXWXWXWX        AA   VWXWXWXWV  AA         XWXWXWXWXWXWXWXW\n"
						+ "XWXWXWXWXWXWXWXW    VWXWXWXA  VWXWXWV  AXWXWXWV    WXWXWXWXWXWXWXWX\n"
						+ "WXWXWXWXWXWXWXWX     XWXWXWXWXWXWXWXWXWXWXWXWX     XWXWXWXWXWXWXWXW\n"
						+ "XWXWXWXWXWXWXWXW   AXWXWXWXWXWXWXWXWXWXWXWXWXWXA   WXWXWXWXWXWXWXWX\n"
						+ "WXWXWXWXWXWXWXWX      VXWXWXWXWXWXWXWXWXWXWXV      XWXWXWXWXWXWXWXW\n"
						+ "XWXWXWXWXWXWXWXW         VXWXWXWXWXWXWXWXV         WXWXWXWXWXWXWXWX\n"
						+ "WXWXWXWXWXWXWXWX           XWXWXWXWXWXWX           XWXWXWXWXWXWXWXW\n"
						+ "XWXWXWXWXWXWXWXW         AXWXWXWXWXWXWXWXA         WXWXWXWXWXWXWXWX\n"
						+ "WXWXWXWXWXWXWXWX                 I                 XWXWXWXWXWXWXWXW\n"
						+ "XWXWXWXWXWXWXWXW                 I                 WXWXWXWXWXWXWXWX\n"
						+ "WXWXWXWXWXWXWXWX                 I                 XWXWXWXWXWXWXWXW\n"
						+ "XWXWXWXWXWXWXWXW                                   WXWXWXWXWXWXWXWX\n"
						+ "-------------------------------------------------------------------\n";
		
		System.out.println(flag);
	}
}
*/

//9
/*
public class Exercices_1 {
	public static void main (String[] args) {
		int longueur = 5;
				
		System.out.println("");
		System.out.println("Périmètre");
		System.out.println(6 * longueur);
		System.out.println("");
		System.out.println("Aire");
		System.out.println(longueur * longueur * 3 * Math.sqrt(3) / 2);
	}
}
*/