package expedia;

import java.util.Scanner;

public class MagicalStrings {
	
	public static int magicalStrings(int n) {
		
		char[] letters = {'a', 'e', 'i', 'o', 'u'};
		int sum = 0;
		
		for (char c: letters) {
			sum += permutations(n, c); 
		}
		
		return sum;
	}
	
	public static int permutations(int l, char c) {
		if (l == 1) {
			return 1;
		} else if (c == 'a') {
			return permutations(l-1, 'e');
		} else if (c == 'e') {
			return permutations(l-1, 'a') + permutations(l-1, 'i');
		} else if (c == 'i') {
			return permutations(l-1, 'a') + permutations(l-1, 'e') + permutations(l-1, 'o') + permutations(l-1, 'u');
		} else if (c == 'o') {
			return permutations(l-1, 'i') + permutations(l-1, 'u');
		} else if (c == 'u') {
			return permutations(l-1, 'a');
		}
		
		return 0;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		System.out.println(magicalStrings(x));
	}

}