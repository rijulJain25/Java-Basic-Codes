/*Question:
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


package Ques;

public class Ques3 {

	public static boolean SplitArr(int arr[], int sum1, int sum2, int str) {
		if(str == arr.length) {
			return sum1 == sum2;
		}
		if(arr[str]%5==0) {
			sum1 +=arr[str];
		}
		else if(arr[str]%3 == 0) {
			sum2 += arr[str];
		}
		else {
			return SplitArr(arr, sum1+arr[str], sum2, str)||SplitArr(arr, sum1, sum2+arr[str], str+1);
		}
		return SplitArr(arr, sum1, sum2, str+1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
