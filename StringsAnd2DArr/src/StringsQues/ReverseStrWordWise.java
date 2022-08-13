/*QUESTIONS:
Reverse the given string word wise. That is, the last word in given string should come at 1st place, last second word at 2nd place and so on. Individual words should remain as it is.
Input format :
String in a single line
Output format :
Word wise reversed string in a single line
Constraints :
0 <= |S| <= 10^7
where |S| represents the length of string, S.
Sample Input 1:
Welcome to Coding Ninjas
Sample Output 1:
Ninjas Coding to Welcome
Sample Input 2:
Always indent your code
Sample Output 2:
code your indent Always
*/


package StringsQues;

import java.util.Scanner;

public class ReverseStrWordWise {
	
	public static String reverseStrWord(String input) {
		input = input + ' ';
		String str = " ";
		int count = 0;
		for(int i = 0; i<input.length(); i++) {
			if(input.charAt(i) == ' ') {
				str = input.substring(count, i+1) + str;
				count = i+1;
			}
		}
		return str;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str =  s.nextLine();
		System.out.print(reverseStrWord(str));
	}

}
