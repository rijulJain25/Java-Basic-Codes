/*Question:
Given a 2D integer array with n rows and m columns. Print the 0th row from input n times, 1st row n-1 times…..(n-1)th row will be printed 1 time.
Input format :
Line 1 : No of rows (n) and no of columns (m) (separated by single space)
Line 2 : Row 1 elements (separated by space)
Line 3 : Row 2 elements (separated by space)
Line 4 : and so on

Sample Input 1:
3 3
1 2 3
4 5 6
7 8 9

Sample Output 1 :
1 2 3
1 2 3
1 2 3
4 5 6
4 5 6
7 8 9
*/


package test2Ques;

import java.util.Scanner;

public class ques1 {
	
	public static void Print2DArr(int arr[][]) {
		for(int i = 0; i< arr.length; i++) {
			for(int j = 0; j<arr.length-i; j++) {
				for(int k = 0; k<arr[0].length; k++) {
					System.out.print(arr[i][k]+" ");
				}
				System.out.println();
			}
		}
	}
	
	public static void print2DArr(int arr[][]) {
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j< arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int[][] arr = new int[n][m];
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j< arr[0].length; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		
		print2DArr(arr);
		Print2DArr(arr);
	}

}
