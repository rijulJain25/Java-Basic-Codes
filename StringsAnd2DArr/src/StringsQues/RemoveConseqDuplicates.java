/*
For a given string(str), remove all the consecutive duplicate characters.
Example:
Input String: "aaaa"
Expected Output: "a"

Input String: "aabbbcc"
Expected Output: "abc"
 Input Format:
The first and only line of input contains a string without any leading and trailing spaces. All the characters in the string would be in lower case.
Output Format:
The only line of output prints the updated string.
Note:
You are not required to print anything. It has already been taken care of.
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1:
aabccbaa
Sample Output 1:
abcba
Sample Input 2:
xxyyzxx
Sample Output 2:
xyzx 
*/


package StringsQues;

import java.util.Scanner;

public class RemoveConseqDuplicates {
	
	public static String RemoveDuplicates(String str) {
		String s = "";
		s = s +str.charAt(0);
		if(str.length() <=1) {
			return str;
		}
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i) != s.charAt(s.length()-1)) {
				s += str.charAt(i);
			}
		}
		return s;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(RemoveDuplicates(str));
	}

}
