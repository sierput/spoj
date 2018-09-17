package spoj;

import java.util.ArrayList;
import java.util.Scanner;

public class Flamaster {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		ArrayList<String> texts = new ArrayList<>();
		for (int i = 0; i < k; i++) {
			texts.add(sc.nextLine());
		}
		sc.close();
		for (String string : texts) {
			if(string.length() == 0) {
				continue;
			}
			char[] text = string.toCharArray();
			ArrayList<String> result = new ArrayList<>();
			int count = 1;
			for (int i = 0; i < text.length - 1; i++) {
				if (text[i] == text[i + 1]) {
					count++;
				} else {
					if (count > 1) {
						result.add(String.valueOf(text[i]));
						result.add(String.valueOf(count));
						count = 1;
					} else {
						result.add(String.valueOf(text[i]));
					}
				}
			}
			if(count > 1) {
				result.add(String.valueOf(text[text.length - 1]));
				result.add(String.valueOf(count));
				System.out.println(result.toString());
			}
			else {
				result.add(String.valueOf(text[text.length - 1]));
				System.out.println(result.toString());
			}
		}
	}
}
