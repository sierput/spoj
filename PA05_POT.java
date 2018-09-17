package spoj;

import java.util.ArrayList;
import java.util.Scanner;
//Podajemy ilość działań
//Podajemy podstawe oraz wykładnik
//Otrzymujemy cyfrę jedności wyniku potęgowania dla poszczególnych działań

public class PA05_POT {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		ArrayList<int[]> numbers = new ArrayList<>();
		for (int i = 0; i < k; i++) {
			int[] par = new int[2];
			par[0] = sc.nextInt();
			par[1] = sc.nextInt();
			numbers.add(par);
		}
		sc.close();

		for (int[] is : numbers) {
			double result = Math.pow(is[0], is[1]);
			char[] tab = String.valueOf(Math.round(result)).toCharArray();
			System.out.println(tab[tab.length - 1]);
		}

	}
}
