/*
 Question:
 Print the following pattern
Pattern for N = 4

The dots represent spaces.


Input Format :
N (Total no. of rows)
Output Format :
Pattern in N lines
Sample Input :
5
Sample Output :

The dots represent spaces
 */




package patterns;

import java.util.Scanner;

public class pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 1; i<=n; i++){
            int val = i;
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print(val);
                val = val+1;
            }
            System.out.println();
        }

	}

}
