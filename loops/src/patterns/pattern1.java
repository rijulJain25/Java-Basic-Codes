/*
  Question:
  Print triangular Star Pattern for an input n:
  
  Sample Input: 4
  Sample Output: 
  *
  **
  ***
  ****
 */



package patterns;

import java.util.Scanner;

public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
