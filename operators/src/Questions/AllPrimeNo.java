/*
QUESTIONS:
Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).
Print the prime numbers in different lines.
Input Format :
Integer N
Output Format :
Prime numbers in different lines
Constraints :
1 <= N <= 100
Sample Input 1:
9
Sample Output 1:
2
3
5
7
Sample Input 2:
20
Sample Output 2:
2
3
5
7
11
13
17
19
*/




package Questions;

import java.util.Scanner;

public class AllPrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 2;
        if(n == 1){
            return;
        }
        while(i<=n){
            boolean check = false;
            for(int j = 2; j<=i/2; j++){
                if(i%j == 0){
                    check = true;
                }
            }
            if(!check){
                System.out.println(i);
            }
            i++;
        }
	}

}
