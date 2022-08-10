/*
QUESTION:
Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to print the answer.
Note : For this question, you can assume that 0 raised to the power of 0 is 1

Input format :
Two integers x and n (separated by space)
Output Format :
x^n (i.e. x raise to the power n)
Constraints:
0 <= x <= 8 
0 <= n <= 9
Sample Input 1 :
 3 4
Sample Output 1 :
81
Sample Input 2 :
 2 5
Sample Output 2 :
32 
*/




package BasicQues;

import java.util.Scanner;

public class FindPowerOfANum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        int pow = x;
        if(x == 0 && n == 0){
            System.out.println(1);
            return;
        }
        if(n == 0){
            System.out.println(1);
            return;
        }
        for(int i = 2; i<=n; i++){
            pow *= x;
        }
        System.out.println(pow);
	}

}
