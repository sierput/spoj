package spoj;

import java.util.ArrayList;
import java.util.Scanner;

public class FCTRL3 {
	// Podajmy ilość
	// Podajemy n!
	// otrzymujemy cyfrę dziesiątek i jedności wyniku dla poszczególnych działań

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		ArrayList<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < k; i++) {
			numbers.add(sc.nextInt());
		}
		sc.close();
		for (Integer number : numbers) {
			System.out.println(silnia(number));
		}
	}

	static String silnia(Integer n) {
		if (n.equals(1))
			return "0 1";
		String result = "";
		int number = 1;
		for (int i = 2; i <= n; i++) {
			number *= i;
		}
		char[] tab = String.valueOf(number).toCharArray();
		result = tab[tab.length - 2] + " " + tab[tab.length - 1];
		return result;
	}
}
