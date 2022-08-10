/*
QUESTION:
Print the following pattern for the given N number of rows.
Pattern for N = 4
    1
   12
  123
 1234

The dots represent spaces.

Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 50
Sample Input 1:
3
Sample Output 1:
      1 
     12
    123
Sample Input 2:
4
Sample Output 2:
      1 
     12
    123
   1234
*/



package patterns;

import java.util.Scanner;

public class pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=n-i; j++) {
				System.out.print(" ");
			}
			int val = 1;
			for(int j = n-i+1; j<=n; j++) {
				System.out.print(val);
				val++;
			}
			System.out.println();
		}
	}
}
