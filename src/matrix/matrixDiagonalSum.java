package matrix;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class matrixDiagonalSum {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n");
		int n;
		int sum = 0;

		n = s.nextInt();
		
		List<List<Integer>> matrix = new ArrayList();
		System.out.println("Enter matrix");
		for (int i = 0; i < n; i++) {
			matrix.add(new ArrayList<Integer>());
			for (int j = 0; j < n; j++) {
				matrix.get(i).add(s.nextInt());
				if ((i == j)|| (i+j==n-1)){
					sum+=matrix.get(i).get(j);
				}

			}

		}
		System.out.println("Sum is:"+sum);
		System.out.println(matrix);
		
	}
}
