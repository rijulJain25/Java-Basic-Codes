/*QUESTION:
For a given a string(str) and a character X, write a function to remove all the occurrences of X from the given string.
The input string will remain unchanged if the given character(X) doesn't exist in the input string.
Input Format:
The first line of input contains a string without any leading and trailing spaces.

The second line of input contains a character(X) without any leading and trailing spaces.
Output Format:
The only line of output prints the updated string. 
Note:
You are not required to print anything explicitly. It has already been taken care of.
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1:
aabccbaa
a
Sample Output 1:
bccb
Sample Input 2:
xxyyzxx
y
Sample Output 2:
xxzxx
*/


package StringsQues;

import java.util.Scanner;

public class RemoveChara {
	public static String removeAllOccurrencesOfChar(String str, char ch) {
		// Your code goes here
        String st = "";
        int i = 0;
        while(i<str.length()){
            if(str.charAt(i) != ch){
                st = st+str.charAt(i);  
            }
            i++;
        }
        return st;
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		char ch = s.next().charAt(0);
		System.out.println(removeAllOccurrencesOfChar(str, ch));
	}
}
