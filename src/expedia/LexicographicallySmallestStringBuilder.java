package expedia;

import java.util.Arrays;
import java.util.Scanner;

public class LexicographicallySmallestStringBuilder {
	
	public static String lexicographicallySmallest(String[] arr) {
		Arrays.sort(arr);
		StringBuilder outStr = new StringBuilder();
		
		for (String s: arr) {
			outStr.append(s);
		}
		
		return outStr.toString();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		in.nextLine();
		String[] strArr = new String[x];
		
		for (int i=0; i < x; i++) {
			strArr[i] = in.nextLine();
		}
		
//		for(String s: strArr) {
//			System.out.println(s);
//		}
		
		System.out.println(lexicographicallySmallest(strArr));
	}

}
