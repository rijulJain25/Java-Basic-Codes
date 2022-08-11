/*QUESTION:
Print the following pattern for given number of rows.

Input format :
Integer N (Total number of rows)

Output Format :
Pattern in N lines

Sample Input :
   5
Sample Output :
 5432*
 543*1
 54*21
 5*321
 *4321
*/

package Ques;

public class Ques1 {
	
	public static boolean DoesSContainT(String s, String t) {
		if(s.length() == 0) {
			return false;
		}
		if(t.length() == 0) {
			return true;
		}
		if(s.charAt(0) == t.charAt(0)) {
			return DoesSContainT(s.substring(1), t.substring(1));
		}
		else {
			return DoesSContainT(s.substring(1), t);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
