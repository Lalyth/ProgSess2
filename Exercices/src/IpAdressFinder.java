/* IpAdressFinder
 * Auteur : Philippe Lamarche
 * Date : 17 Avril 2020 */

public class IpAdressFinder {
	public static void main(String[] args) {
		String adresse = "192.168.1.2";
		// String masque = "/24";
		String masqueBinaire = "11111111111111111111111100000000";
		System.out.println(masqueBinaire.indexOf("0")); // retourne 24 si tout est collé
		
		String[] ipParts = adresse.split("\\."); // split ladresse en 4
		System.out.println(ipParts[0] + "." + ipParts[1] + "." + ipParts[2] + "." + ipParts[3]);

		int ip0 = Integer.parseInt(ipParts[0]);
		int ip1 = Integer.parseInt(ipParts[1]);
		int ip2 = Integer.parseInt(ipParts[2]);
		int ip3 = Integer.parseInt(ipParts[3]);
		System.out.println(ip0);
		System.out.println(Integer.toBinaryString(ip0)); // imprimer en binaire
		System.out.println(ip1);
		System.out.println(Integer.toBinaryString(ip1));
		System.out.println(ip2);
		System.out.println(Integer.toBinaryString(ip2));
		System.out.println(ip3);
		System.out.println(Integer.toBinaryString(ip3));
	}
}