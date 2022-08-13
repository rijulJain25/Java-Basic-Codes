/*QUESTION:
For a given two strings, 'str1' and 'str2', check whether they are a permutation of each other or not.
Permutations of each other
Two strings are said to be a permutation of each other when either of the string's characters can be rearranged so that it becomes identical to the other one.

Example: 
str1= "sinrtg" 
str2 = "string"

The character of the first string(str1) can be rearranged to form str2 and hence we can say that the given strings are a permutation of each other.
Input Format:
The first line of input contains a string without any leading and trailing spaces, representing the first string 'str1'.

The second line of input contains a string without any leading and trailing spaces, representing the second string 'str2'.
Note:
All the characters in the input strings would be in lower case.
Output Format:
The only line of output prints either 'true' or 'false', denoting whether the two strings are a permutation of each other or not.

You are not required to print anything. It has already been taken care of. Just implement the function. 
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1:
abcde
baedc
Sample Output 1:
true
Sample Input 2:
abc
cbd
Sample Output 2:
false
*/


package StringsQues;

import java.util.Scanner;

public class chkPermutation {
	public static boolean isPermutation(String str1, String str2) {
		boolean state = true;
		if(str1.length() == str2.length()) {
			int arr[] = new int[256];
			for(int i = 0; i<str1.length(); i++) {
				int a = (int)str1.charAt(i);
				arr[a]++;
			}
			
			for(int i = 0; i< str2.length(); i++) {
				int a = (int)str2.charAt(i);
				arr[a]--;
			}
			
			for(int i = 0; i< 256; i++) {
				if(arr[i] != 0) {
					return false;
				}
			}
		}
		else {
			state = false;
		}
		return state;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine();
		String str2 = s.nextLine();

		System.out.print(isPermutation(str1, str2));
		
	}
}
