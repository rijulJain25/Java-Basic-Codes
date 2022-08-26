/*QUESTION:
Write a Program to determine if the given number is Armstrong number or not. Print true if number is armstrong, otherwise print false.
An Armstrong number is a number (with digits n) such that the sum of its digits raised to nth power is equal to the number itself.
For example,
371, as 3^3 + 7^3 + 1^3 = 371
1634, as 1^4 + 6^4 + 3^4 + 4^4 = 1634
Input Format :
Integer n
Output Format :
true or false
Sample Input 1 :
1
Sample Output 1 :
true
Sample Input 2 :
103
Sample Output 2 :
false
*/

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x;
        int y = n;
        int ams = 0;
        int j;
        if(y == 0){
            System.out.println(true);
            return;
        }
        int count = 0;
        while(y > 0){
            j = y%10;
            y = y/10;
            count++;
        }
        y = n;
        while(y>0){
            x = y%10;
            ams += Math.pow(x, count);
            y = y/10;
        }
        if(ams == (n)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
	}
}
