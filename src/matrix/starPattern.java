package matrix;

import java.util.Scanner;

public class starPattern {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter height");
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			for(int j=i;j<n;j++ ) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2*i+1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		for (int i = n-2; i >=0; i--) {
			for(int j=i;j<n;j++ ) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2*i+1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
