package org.blagnac.cpoa;

/**
 * @author bruel
 * @navassoc - - 1 Canard
 * @note Main de test simple
 *
 */
public class SuperCanard {

	public static void main(String[] args) {
		Canard c1 = new Colvert();
		String info;
		info = c1.cancaner();
		info = c1.nager();
		info = c1.afficher();
		System.out.println(info);
	}
}
