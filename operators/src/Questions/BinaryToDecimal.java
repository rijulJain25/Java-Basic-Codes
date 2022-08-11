/*
QUESTION:
Given a binary number as an integer N, convert it into decimal and print.
Input format :
An integer N in the Binary Format
Output format :
Corresponding Decimal number (as integer)
Constraints :
0 <= N <= 10^9
Sample Input 1 :
1100
Sample Output 1 :
12
Sample Input 2 :
111
Sample Output 2 :
7
*/


package Questions;

import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int dec = 0;
		int base = 1;
		int n = s.nextInt();
		while(n>0) {
			int rem = n%10;
			if(rem!=0 && rem !=1) {
				break;
			}
			dec += base*rem;
			base *= 2;
			n = n/10;
		}
		System.out.println(dec);
	}
}
