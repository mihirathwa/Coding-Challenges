package expedia;

import java.util.Scanner;

public class SimpleMatrixSummation {
	
	public static int[][] findMatrix(int arr[][]) {
		
		for (int i=0; i< arr.length; i++) {
			int rowSum = 0;
			for (int j=0; j < arr[0].length; j++) {
				if (i == 0) {
					rowSum += arr[i][j];
					arr[i][j] = rowSum;
				} else {
					rowSum += arr[i][j];
					arr[i][j] = rowSum + arr[i-1][j];
				}
			}
			rowSum = 0;
		}
		
		
		return arr;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		int[][] inpMatrix = new int[m][n];
		
		for (int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				inpMatrix[i][j] = in.nextInt();
			}
		}
		
		int[][] outMatrix = findMatrix(inpMatrix);
		for (int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				System.out.print(outMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
