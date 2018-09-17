package spoj;

import java.util.ArrayList;
import java.util.Scanner;
//Podajemty ilość
//Podajemy liczby
//Otrzymujemy informacje czy podanej liczby są pierwsze

public class PrimeNumber {
	static boolean prime = false;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		ArrayList<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < k; i++) {
			numbers.add(sc.nextInt());
		}
		sc.close();
		for (Integer number : numbers) {
			prime = false;
			System.out.println(prime(number));
		}
	}

	public static String prime(int n) {
		for (int j = 2; j < n; j++) {
			if (n % j == 0) {
				prime = true;
				break;
			}
		}
		if (!prime) {
			return "Tak" + n + "\n";
		} else {
			return "Nie" + n + "\n";
		}
	}
}
